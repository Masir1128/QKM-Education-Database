package com.qkm.wiki.controller;

import com.qkm.wiki.req.AbilityQueryReq;
import com.qkm.wiki.req.AbilitySaveReq;
import com.qkm.wiki.resp.*;
import com.qkm.wiki.service.AbilityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/ability")
public class AbilityController {


    @Resource
    private AbilityService AbilityService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<AbilityQueryResp>> resp = new CommonResp<>();
        List<AbilityQueryResp> list = AbilityService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid AbilityQueryReq req){
        CommonResp<PageResp<AbilityQueryResp>> resp = new CommonResp<>();
        PageResp<AbilityQueryResp> list = AbilityService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody AbilitySaveReq req){
        CommonResp resp = new CommonResp<>();
        AbilityService.save(req);
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
        AbilityService.delete(id);
        return resp;
    }

    /**
     * Desp: 这是自定义查询的接口
     * @param:查询姓名 + 培训期数 + 培训次数
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/find/{name}/{qishu}/{num}" )
    public CommonResp find(@PathVariable String name,@PathVariable String qishu,@PathVariable String num ){
        CommonResp<List<AbilityQueryResp>> resp = new CommonResp<>();
        List<AbilityQueryResp> list = AbilityService.find(name,qishu,num);
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
        CommonResp<List<AbilityQueryResp>> resp = new CommonResp<>();
        List<AbilityQueryResp> list = AbilityService.findname(name);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询排名
     * @return:返回封装好的结果list
     */
    @RequestMapping("/sort/{num}" )
    public CommonResp sort(@PathVariable String num){
        CommonResp<List<AbilityQueryResp>> resp = new CommonResp<>();
        List<AbilityQueryResp> list = AbilityService.findsort(num);
        resp.setContent(list);
        return resp;
    }


    /**
     * Desp: 查询
     * @param:查询平均分
     * @return:返回封装好的结果list
     */
    @RequestMapping("/average/{average}" )
    public CommonResp average(@PathVariable String average){
        CommonResp<List<AbilityQueryResp>> resp = new CommonResp<>();
        List<AbilityQueryResp> list = AbilityService.findaverage(average);
        resp.setContent(list);
        return resp;
    }

    /**
     * 根据任务查询导师评论和个人总结
     * @param
     */
    @RequestMapping(value = "/conclude/{name}/{task}/{num}")
    public CommonResp conclude(@PathVariable String name,@PathVariable String task,@PathVariable String num){
        CommonResp<List<AbilityQueryResp>> resp = new CommonResp<>();
        List<AbilityQueryResp> list = AbilityService.conclude(name,task,num);
        System.out.println("-------------------"+list);
        resp.setContent(list);
        return resp;
    }
}
