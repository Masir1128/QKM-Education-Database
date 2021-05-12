package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Courseplan;
import com.qkm.wiki.req.CourseplanQueryReq;
import com.qkm.wiki.req.CourseplanSaveReq;
import com.qkm.wiki.resp.AbilityQueryResp;
import com.qkm.wiki.resp.CourseplanQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.CourseplanService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/courseplan")
public class CourseplanController {


    @Resource
    private CourseplanService CourseplanService;

    @GetMapping("/all/{id}")
    public CommonResp all(@PathVariable Long id){
        CommonResp<List<CourseplanQueryResp>> resp = new CommonResp<>();
        List<CourseplanQueryResp> list = CourseplanService.all(id);
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid CourseplanQueryReq req){
        CommonResp<PageResp<CourseplanQueryResp>> resp = new CommonResp<>();
        PageResp<CourseplanQueryResp> list = CourseplanService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody CourseplanSaveReq req){
        CommonResp resp = new CommonResp<>();
        CourseplanService.save(req);
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
        CourseplanService.delete(id);
        return resp;
    }

    /**
     * Desp: 查询
     * @param:查询姓名
     * @return:返回封装好的结果list
     */
    @RequestMapping(value = "/findid/{id}" )
    public CommonResp findid(@PathVariable Long id){
        CommonResp<List<CourseplanQueryResp>> resp = new CommonResp<>();
        List<CourseplanQueryResp> list = CourseplanService.findid(id);
        resp.setContent(list);
        return resp;
    }
}
