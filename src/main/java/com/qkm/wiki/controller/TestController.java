package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Test;
import com.qkm.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
public class TestController {

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
}
