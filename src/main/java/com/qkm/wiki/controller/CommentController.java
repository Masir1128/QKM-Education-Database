package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Comment;
import com.qkm.wiki.domain.Tstask2;
import com.qkm.wiki.req.CommentQueryReq;
import com.qkm.wiki.req.CommentSaveReq;
import com.qkm.wiki.resp.CommentQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.ScoreQueryResp;
import com.qkm.wiki.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/comment")
public class CommentController {


    @Resource
    private CommentService CommentService;

    @GetMapping("/list1")
    public List<Comment> list(){
        //CommonResp<List<Tstask1>> resp = new CommonResp<>();
        return CommentService.list();
        //resp.setContent(list);

    }

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<CommentQueryResp>> resp = new CommonResp<>();
        List<CommentQueryResp> list = CommentService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid CommentQueryReq req){
        CommonResp<PageResp<CommentQueryResp>> resp = new CommonResp<>();
        PageResp<CommentQueryResp> list = CommentService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody CommentSaveReq req){
        CommonResp resp = new CommonResp<>();
        CommentService.save(req);
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
        CommentService.delete(id);
        return resp;
    }

    /**
     * 根据电子书的文档查询电子书评论
     * @param ebookid
     */
    @GetMapping(value = "/findebookid/{ebookid}")
    public CommonResp findebookid(@PathVariable Long ebookid){
        CommonResp<List<CommentQueryResp>> resp = new CommonResp<>();
        List<CommentQueryResp> list = CommentService.findebookid(ebookid);
        System.out.println("-------------------"+list);
        resp.setContent(list);
        return resp;
    }
}
