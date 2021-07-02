package com.qkm.wiki.controller;

import com.qkm.wiki.req.ActicleQueryReq;
import com.qkm.wiki.req.ActicleSaveReq;
import com.qkm.wiki.resp.CommentQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.ActicleQueryResp;
import com.qkm.wiki.service.ActicleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/acticle")
public class ActicleController {


    @Resource
    private ActicleService ActicleService;


    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<ActicleQueryResp>> resp = new CommonResp<>();
        List<ActicleQueryResp> list = ActicleService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid ActicleQueryReq req){
        CommonResp<PageResp<ActicleQueryResp>> resp = new CommonResp<>();
        PageResp<ActicleQueryResp> list = ActicleService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody ActicleSaveReq req){
        CommonResp resp = new CommonResp<>();
        ActicleService.save(req);
        return resp;
    }

    /**
     * Desp: 这是电子书管理删除接口
     * @param
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id){
        CommonResp resp = new CommonResp<>();
        ActicleService.delete(id);
        return resp;
    }


    /**
     * 根据电子书的文档查询电子书评论
     * @param ebookid
     */
    @GetMapping(value = "/findebookid/{ebookid}")
    public CommonResp findebookid(@PathVariable Long ebookid){
        CommonResp<List<ActicleQueryResp>> resp = new CommonResp<>();
        List<ActicleQueryResp> list = ActicleService.findebookid(ebookid);
        System.out.println("-------------------"+list);
        resp.setContent(list);
        return resp;
    }


}
