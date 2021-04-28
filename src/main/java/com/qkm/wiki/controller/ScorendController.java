package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Scorend;
import com.qkm.wiki.req.ScorendQueryReq;
import com.qkm.wiki.req.ScorendSaveReq;
import com.qkm.wiki.resp.ScorendQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.ScorendService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/scorend")
public class ScorendController {


    @Resource
    private ScorendService ScorendService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<ScorendQueryResp>> resp = new CommonResp<>();
        List<ScorendQueryResp> list = ScorendService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid ScorendQueryReq req){
        CommonResp<PageResp<ScorendQueryResp>> resp = new CommonResp<>();
        PageResp<ScorendQueryResp> list = ScorendService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody ScorendSaveReq req){
        CommonResp resp = new CommonResp<>();
        ScorendService.save(req);
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
        ScorendService.delete(id);
        return resp;
    }

}
