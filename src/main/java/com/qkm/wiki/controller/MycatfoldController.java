package com.qkm.wiki.controller;

import com.qkm.wiki.req.MycatfoldQueryReq;
import com.qkm.wiki.req.MycatfoldSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.MycatfoldQueryResp;
import com.qkm.wiki.service.MycatfoldService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/mycatfold")
public class MycatfoldController {


    @Resource
    private MycatfoldService MycatfoldService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<MycatfoldQueryResp>> resp = new CommonResp<>();
        List<MycatfoldQueryResp> list = MycatfoldService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid MycatfoldQueryReq req){
        CommonResp<PageResp<MycatfoldQueryResp>> resp = new CommonResp<>();
        PageResp<MycatfoldQueryResp> list = MycatfoldService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody MycatfoldSaveReq req){
        CommonResp resp = new CommonResp<>();
        MycatfoldService.save(req);
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
        MycatfoldService.delete(id);
        return resp;
    }

}
