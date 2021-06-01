package com.qkm.wiki.controller;

import com.qkm.wiki.req.Zlcat2QueryReq;
import com.qkm.wiki.req.Zlcat2SaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.TrainingQueryResp;
import com.qkm.wiki.resp.Zlcat2QueryResp;
import com.qkm.wiki.service.Zlcat2Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/zlcat2")
public class Zlcat2Controller {


    @Resource
    private Zlcat2Service Zlcat2Service;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<Zlcat2QueryResp>> resp = new CommonResp<>();
        List<Zlcat2QueryResp> list = Zlcat2Service.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid Zlcat2QueryReq req){
        CommonResp<PageResp<Zlcat2QueryResp>> resp = new CommonResp<>();
        PageResp<Zlcat2QueryResp> list = Zlcat2Service.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody Zlcat2SaveReq req){
        CommonResp resp = new CommonResp<>();
        Zlcat2Service.save(req);
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
        Zlcat2Service.delete(id);
        return resp;
    }


    /**
     * Desp: 查询
     * @param:查询姓名
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find/{cat}" )
    public CommonResp findlevel(@PathVariable String cat){
        CommonResp<List<Zlcat2QueryResp>> resp = new CommonResp<>();
        List<Zlcat2QueryResp> list = Zlcat2Service.findcat(cat);
        resp.setContent(list);
        return resp;
    }
}
