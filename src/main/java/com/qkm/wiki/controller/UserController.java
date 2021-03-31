package com.qkm.wiki.controller;

import com.qkm.wiki.req.UserLoginReq;
import com.qkm.wiki.req.UserQueryReq;
import com.qkm.wiki.req.UserResetPasswordReq;
import com.qkm.wiki.req.UserSaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.UserLoginResp;
import com.qkm.wiki.resp.UserQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.UserService;
import com.qkm.wiki.util.SnowFlake;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.concurrent.TimeUnit;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService UserService;

    // 需要将用户信息进行保存
    @Resource
    private RedisTemplate redisTemplate;

    // 注入雪花算法
    @Resource
    private SnowFlake snowFlake;

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
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
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

    @PostMapping("/reset-password")
    public CommonResp resetPassword(@Valid @RequestBody UserResetPasswordReq req) {
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp resp = new CommonResp<>();
        UserService.resetPassword(req);
        return resp;
    }

    /**
     * 用户登录接口
     * @param req
     * @return
     */
    @PostMapping("/login")
    public CommonResp login(@Valid @RequestBody UserLoginReq req) {
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp<UserLoginResp> resp = new CommonResp<>();
        UserLoginResp userLoginResp = UserService.login(req);

        Long token = snowFlake.nextId();
        LOG.info("生成单点登录token：{}，并放入redis中", token);
        userLoginResp.setToken(token.toString());
        redisTemplate.opsForValue().set(token.toString(), JSONObject.toJSONString(userLoginResp), 3600 * 24, TimeUnit.SECONDS);
        resp.setContent(userLoginResp);

        return resp;
    }

    /**
     * 用户退出登录
     * @param token
     * @return
     */
    @GetMapping("/logout/{token}")
    public CommonResp logout(@PathVariable String token) {
        CommonResp resp = new CommonResp<>();
        redisTemplate.delete(token);
        LOG.info("从redis中删除token: {}", token);
        return resp;
    }

}
