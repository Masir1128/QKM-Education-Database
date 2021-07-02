package com.qkm.wiki.controller;

import com.qkm.wiki.req.ZlQueryReq;
import com.qkm.wiki.req.ZlSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.ZlQueryResp;
import com.qkm.wiki.resp.Zlcat3QueryResp;
import com.qkm.wiki.service.ZlService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/zl")
public class ZlController {


    @Resource
    private ZlService ZlService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid ZlQueryReq req){
        CommonResp<PageResp<ZlQueryResp>> resp = new CommonResp<>();
        PageResp<ZlQueryResp> list = ZlService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody ZlSaveReq req){
        CommonResp resp = new CommonResp<>();
        ZlService.save(req);
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
        ZlService.delete(id);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询分类3
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find/{cat}" )
    public CommonResp findlevel(@PathVariable String cat){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.findcat(cat);
        resp.setContent(list);
        return resp;
    }


    /**
     * Desp: 查询
     * @param:查询分类3
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findnamer/{name}" )
    public CommonResp findname(@PathVariable String name){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.findname(name);
        resp.setContent(list);
        return resp;
    }



    /**
     * Desp: 查询
     * @param:查询分类1
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find1/{cat}" )
    public CommonResp findlevel1(@PathVariable String cat){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.findcat1(cat);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询分类2
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find2/{cat}" )
    public CommonResp findlevel2(@PathVariable String cat){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.findcat2(cat);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询标题
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findname/{id}" )
    public CommonResp findlevel(@PathVariable Long id){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.findid(id);
        resp.setContent(list);
        return resp;
    }


    /**
     * Desp: 查询
     * @param:查询内容
     * @return:返回封装好的结果list
     */
    @GetMapping("/find-content/{id}")
    public CommonResp findContent(@PathVariable Long id){
        CommonResp<String> resp = new CommonResp<>();
        String content = ZlService.findContent(id);
        resp.setContent(content);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询人名下面的文章
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findpersonal/{namer}" )
    public CommonResp findpersonal(@PathVariable String namer){
        CommonResp<List<ZlQueryResp>> resp = new CommonResp<>();
        List<ZlQueryResp> list = ZlService.findpersonal(namer);
        resp.setContent(list);
        return resp;
    }
    
}
