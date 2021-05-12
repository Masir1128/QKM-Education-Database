package com.qkm.wiki.controller;

import com.qkm.wiki.req.UseradminQueryReq;
import com.qkm.wiki.req.UseradminSaveReq;
import com.qkm.wiki.resp.UseradminQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.UseradminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/useradmin")
public class UseradminController {


    @Resource
    private UseradminService UseradminService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<UseradminQueryResp>> resp = new CommonResp<>();
        List<UseradminQueryResp> list = UseradminService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid UseradminQueryReq req){
        CommonResp<PageResp<UseradminQueryResp>> resp = new CommonResp<>();
        PageResp<UseradminQueryResp> list = UseradminService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody UseradminSaveReq req){
        CommonResp resp = new CommonResp<>();
        UseradminService.save(req);
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
        UseradminService.delete(id);
        return resp;
    }


}
