package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Test;
import com.qkm.wiki.service.TestService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;
/**
 * @Masir Description:
 * IO:
 */
@RestController
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String hello(){
        return "李群机器人";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World ! Post." + name;
    }
    @Resource
    private TestService testService;
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

    @RequestMapping("/redis/set/{key}/{value}")
    public String set(@PathVariable Long key, @PathVariable String value) {
        redisTemplate.opsForValue().set(key, value, 3600, TimeUnit.SECONDS);
        LOG.info("key: {}, value: {}", key, value);
        return "success";
    }

    @RequestMapping("/redis/get/{key}")
    public Object get(@PathVariable Long key) {
        Object object = redisTemplate.opsForValue().get(key);
        LOG.info("key: {}, value: {}", key, object);
        return object;
    }
}


