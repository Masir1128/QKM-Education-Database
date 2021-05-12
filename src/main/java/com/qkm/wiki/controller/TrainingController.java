package com.qkm.wiki.controller;

import com.qkm.wiki.req.TrainingQueryReq;
import com.qkm.wiki.req.TrainingSaveReq;
import com.qkm.wiki.resp.TrainingQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.TrainingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/training")
public class TrainingController {


    @Resource
    private TrainingService TrainingService;

    @GetMapping("/all/{id}")
    public CommonResp all(@PathVariable Long id){
        CommonResp<List<TrainingQueryResp>> resp = new CommonResp<>();
        List<TrainingQueryResp> list = TrainingService.all(id);
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid TrainingQueryReq req){
        CommonResp<PageResp<TrainingQueryResp>> resp = new CommonResp<>();
        PageResp<TrainingQueryResp> list = TrainingService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody TrainingSaveReq req){
        CommonResp resp = new CommonResp<>();
        TrainingService.save(req);
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
        TrainingService.delete(id);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询姓名
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findlevel/{level}" )
    public CommonResp findlevel(@PathVariable String level){
        CommonResp<List<TrainingQueryResp>> resp = new CommonResp<>();
        List<TrainingQueryResp> list = TrainingService.findlevel(level);
        resp.setContent(list);
        return resp;
    }


    /**
     * Desp: 这是自定义查询的接口
     * @param:查询姓名 + 查询部门
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findCapLevel/{level}/{name}" )
    public CommonResp findCapLevel(@PathVariable String level,@PathVariable String name){
        CommonResp<List<TrainingQueryResp>> resp = new CommonResp<>();
        List<TrainingQueryResp> list = TrainingService.findCapLevel(level,name);
        resp.setContent(list);
        return resp;
    }
}
