package com.qkm.wiki.controller;

import com.qkm.wiki.req.UserQueryReq;
import com.qkm.wiki.req.UserSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.UserQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService UserService;

    @GetMapping("/list")
    public CommonResp list(@Valid UserQueryReq req){
        CommonResp<PageResp<UserQueryResp>> resp = new CommonResp<>();
        PageResp<UserQueryResp> list = UserService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody UserSaveReq req){
        CommonResp resp = new CommonResp<>();
        UserService.save(req);
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
        UserService.delete(id);
        return resp;
    }
}
