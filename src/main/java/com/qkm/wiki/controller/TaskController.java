package com.qkm.wiki.controller;

import com.qkm.wiki.req.TaskQueryReq;
import com.qkm.wiki.req.TaskSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.TaskQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.TaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/task")
public class TaskController {


    @Resource
    private TaskService TaskService;

    @GetMapping("/list")
    public CommonResp list(@Valid TaskQueryReq req){
        CommonResp<PageResp<TaskQueryResp>> resp = new CommonResp<>();
        PageResp<TaskQueryResp> list = TaskService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody TaskSaveReq req){
        CommonResp resp = new CommonResp<>();
        TaskService.save(req);
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
        TaskService.delete(id);
        return resp;
    }
}
