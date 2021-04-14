package com.qkm.wiki.service;

import com.qkm.wiki.domain.Test;
import com.qkm.wiki.domain.Tstask1;
import com.qkm.wiki.domain.Tstask2;
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
}
