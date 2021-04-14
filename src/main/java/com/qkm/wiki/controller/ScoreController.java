package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Test;
import com.qkm.wiki.req.ScoreQueryReq;
import com.qkm.wiki.req.ScoreSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.ScoreQueryResp;
import com.qkm.wiki.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/score")
public class ScoreController {


    @Resource
    private ScoreService ScoreService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<ScoreQueryResp>> resp = new CommonResp<>();
        List<ScoreQueryResp> list = ScoreService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid ScoreQueryReq req){
        CommonResp<PageResp<ScoreQueryResp>> resp = new CommonResp<>();
        PageResp<ScoreQueryResp> list = ScoreService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody ScoreSaveReq req){
        CommonResp resp = new CommonResp<>();
        ScoreService.save(req);
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
        ScoreService.delete(id);
        return resp;
    }

    /**
     * Desp: 这是自定义查询的接口
     * @param:查询姓名 + 查询任务
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find/{name}/{parents}" )
    public CommonResp find(@PathVariable String name,@PathVariable String parents){
        CommonResp<List<ScoreQueryResp>> resp = new CommonResp<>();
        List<ScoreQueryResp> list = ScoreService.find(name,parents);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询姓名
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findname/{name}" )
    public CommonResp findname(@PathVariable String name){
        CommonResp<List<ScoreQueryResp>> resp = new CommonResp<>();
        List<ScoreQueryResp> list = ScoreService.findname(name);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是一个用于反馈到管理员页面的成绩反馈接口
     * @param:查询
     * @return:返回封装好的结果list
     */


}
