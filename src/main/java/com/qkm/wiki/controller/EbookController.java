package com.qkm.wiki.controller;

import com.qkm.wiki.req.EbookQueryReq;
import com.qkm.wiki.req.EbookSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.EbookQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {


    @Resource
    private EbookService EbookService;

    @GetMapping("/list")
    public CommonResp list(EbookQueryReq req){
        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
        PageResp<EbookQueryResp> list = EbookService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req){
        CommonResp resp = new CommonResp<>();
        EbookService.save(req);
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
        EbookService.delete(id);
        return resp;
    }
}
