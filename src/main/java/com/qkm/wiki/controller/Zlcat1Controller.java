package com.qkm.wiki.controller;

import com.qkm.wiki.req.Zlcat1QueryReq;
import com.qkm.wiki.req.Zlcat1SaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.Zlcat1QueryResp;
import com.qkm.wiki.service.Zlcat1Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/zlcat1")
public class Zlcat1Controller {


    @Resource
    private Zlcat1Service Zlcat1Service;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<Zlcat1QueryResp>> resp = new CommonResp<>();
        List<Zlcat1QueryResp> list = Zlcat1Service.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid Zlcat1QueryReq req){
        CommonResp<PageResp<Zlcat1QueryResp>> resp = new CommonResp<>();
        PageResp<Zlcat1QueryResp> list = Zlcat1Service.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody Zlcat1SaveReq req){
        CommonResp resp = new CommonResp<>();
        Zlcat1Service.save(req);
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
        Zlcat1Service.delete(id);
        return resp;
    }
}
