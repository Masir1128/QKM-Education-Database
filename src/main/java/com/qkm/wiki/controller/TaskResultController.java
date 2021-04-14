package com.qkm.wiki.controller;

import com.qkm.wiki.domain.Tstask1;
import com.qkm.wiki.domain.Tstask2;
import com.qkm.wiki.domain.Tstask3;
import com.qkm.wiki.domain.Tstask4;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.ScoreQueryResp;
import com.qkm.wiki.service.TaskResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/TaskResult")
public class TaskResultController {
    @Resource
    private TaskResultService taskResultService;

    @RequestMapping("/hello")
    public String hello(){
        return "李群机器人";
    }

    /**
     * 这是一个查询TS 任务1 ：评分标准的接口
     * @return
     */
    @GetMapping("/task1/list")
    public List<Tstask1> list(){
        //CommonResp<List<Tstask1>> resp = new CommonResp<>();
        return taskResultService.list();
        //resp.setContent(list);

    }
    /**
     * 这是一个查询TS 任务2 ：评分标准的接口
     * @return
     */
    @GetMapping("/task2/list")
    public List<Tstask2> list1(){
        //CommonResp<List<Tstask1>> resp = new CommonResp<>();
        return taskResultService.list1();
        //resp.setContent(list);

    }

    /**
     * 这是一个查询TS 任务3 ：评分标准的接口
     * @return
     */
    @GetMapping("/task3/list")
    public List<Tstask3> list3(){
        return taskResultService.list3();

    }

    /**
     * 这是一个查询TS 任务4：评分标准的接口
     * @return
     */
    @GetMapping("/task4/list")
    public List<Tstask4> list4(){
        return taskResultService.list4();

    }
}
