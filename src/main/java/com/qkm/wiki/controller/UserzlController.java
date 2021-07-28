package com.qkm.wiki.controller;

import com.qkm.wiki.req.UserzlQueryReq;
import com.qkm.wiki.req.UserzlSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.UserzlQueryResp;
import com.qkm.wiki.service.UserzlService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/userzl")
public class UserzlController {


    @Resource
    private UserzlService UserzlService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<UserzlQueryResp>> resp = new CommonResp<>();
        List<UserzlQueryResp> list = UserzlService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid UserzlQueryReq req){
        CommonResp<PageResp<UserzlQueryResp>> resp = new CommonResp<>();
        PageResp<UserzlQueryResp> list = UserzlService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody UserzlSaveReq req){
        CommonResp resp = new CommonResp<>();
        UserzlService.save(req);
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
        UserzlService.delete(id);
        return resp;
    }

}
