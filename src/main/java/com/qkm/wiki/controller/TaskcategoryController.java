package com.qkm.wiki.controller;

import com.qkm.wiki.req.TaskcategoryQueryReq;
import com.qkm.wiki.req.TaskcategorySaveReq;
import com.qkm.wiki.resp.TaskcategoryQueryResp;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.TaskcategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/taskcategory")
public class TaskcategoryController {


    @Resource
    private TaskcategoryService TaskcategoryService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<TaskcategoryQueryResp>> resp = new CommonResp<>();
        List<TaskcategoryQueryResp> list = TaskcategoryService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid TaskcategoryQueryReq req){
        CommonResp<PageResp<TaskcategoryQueryResp>> resp = new CommonResp<>();
        PageResp<TaskcategoryQueryResp> list = TaskcategoryService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody TaskcategorySaveReq req){
        CommonResp resp = new CommonResp<>();
        TaskcategoryService.save(req);
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
        TaskcategoryService.delete(id);
        return resp;
    }
}
