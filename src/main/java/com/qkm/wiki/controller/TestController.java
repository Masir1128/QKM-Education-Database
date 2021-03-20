package com.qkm.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Masir Description:
 * IO:
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "李群";

    }
}
