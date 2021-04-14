package com.qkm.wiki.service;

import com.qkm.wiki.domain.*;
import com.qkm.wiki.mapper.TaskResultMapper;
import com.qkm.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@Service
public class TaskResultService {

    @Resource
    private TaskResultMapper taskResultMapper;

    public List<Tstask1> list(){
        return taskResultMapper.list();
    }

    public List<Tstask2> list1(){
        return taskResultMapper.list1();
    }

    public List<Tstask3> list3(){
        return taskResultMapper.list3();
    }

    public List<Tstask4> list4(){
        return taskResultMapper.list4();
    }
}
