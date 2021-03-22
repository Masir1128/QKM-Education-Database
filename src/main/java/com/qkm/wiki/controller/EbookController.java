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


    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req){
        CommonResp resp = new CommonResp<>();
        EbookService.save(req);
        return resp;
    }
}
