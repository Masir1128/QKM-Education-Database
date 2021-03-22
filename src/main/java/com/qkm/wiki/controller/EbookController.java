package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Ebook;
import com.qkm.wiki.req.EbookReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.EbookResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    public CommonResp list(EbookReq req){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = EbookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
