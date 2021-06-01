package com.qkm.wiki.controller;

import com.qkm.wiki.req.Zlcat3QueryReq;
import com.qkm.wiki.req.Zlcat3SaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.Zlcat2QueryResp;
import com.qkm.wiki.resp.Zlcat3QueryResp;
import com.qkm.wiki.service.Zlcat3Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/zlcat3")
public class Zlcat3Controller {


    @Resource
    private Zlcat3Service Zlcat3Service;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<Zlcat3QueryResp>> resp = new CommonResp<>();
        List<Zlcat3QueryResp> list = Zlcat3Service.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid Zlcat3QueryReq req){
        CommonResp<PageResp<Zlcat3QueryResp>> resp = new CommonResp<>();
        PageResp<Zlcat3QueryResp> list = Zlcat3Service.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody Zlcat3SaveReq req){
        CommonResp resp = new CommonResp<>();
        Zlcat3Service.save(req);
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
        Zlcat3Service.delete(id);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询姓名
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find/{cat}" )
    public CommonResp findlevel(@PathVariable String cat){
        CommonResp<List<Zlcat3QueryResp>> resp = new CommonResp<>();
        List<Zlcat3QueryResp> list = Zlcat3Service.findcat(cat);
        resp.setContent(list);
        return resp;
    }

}
