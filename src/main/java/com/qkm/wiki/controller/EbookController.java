package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Ebook;
import com.qkm.wiki.resp.CommonResp;
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
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = EbookService.list();
        resp.setContent(list);
        return resp;
    }
}
