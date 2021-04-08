package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Task;
import com.qkm.wiki.domain.TaskExample;
import com.qkm.wiki.mapper.TaskMapper;
import com.qkm.wiki.req.TaskQueryReq;
import com.qkm.wiki.req.TaskSaveReq;
import com.qkm.wiki.resp.TaskQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.util.CopyUtil;
import com.qkm.wiki.util.SnowFlake;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@Service
public class TaskService {

    @Resource
    private TaskMapper TaskMapper;

    @Resource
    private SnowFlake snowFlake ;

    public PageResp<TaskQueryResp> list(TaskQueryReq req){

        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();

        List<Task> taskList = TaskMapper.selectByExample(taskExample);
        PageInfo<Task> pageInfo = new PageInfo<>(taskList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<TaskResp> respList = new ArrayList<>();
//        for(Task task : taskList){
////            TaskResp taskResp = new TaskResp();
////            BeanUtils.copyProperties(task,taskResp);
//            // 对象复制
//            TaskResp taskResp = CopyUtil.copy(task, TaskResp.class);
//            respList.add(taskResp);
//        }

        // 列表复制
        List<TaskQueryResp> list = CopyUtil.copyList(taskList, TaskQueryResp.class);

        PageResp<TaskQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(TaskSaveReq req){
        Task task = CopyUtil.copy(req,Task.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            task.setId(snowFlake.nextId());

            TaskMapper.insert(task);
        }else {
            // 更新
            TaskMapper.updateByPrimaryKey(task);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        System.out.println("-------------");
        System.out.println(id);
        TaskMapper.deleteByPrimaryKey(id);
    }
}
