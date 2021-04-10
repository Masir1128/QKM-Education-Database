package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Taskcategory;
import com.qkm.wiki.domain.TaskcategoryExample;
import com.qkm.wiki.mapper.TaskcategoryMapper;
import com.qkm.wiki.req.TaskcategoryQueryReq;
import com.qkm.wiki.req.TaskcategorySaveReq;
import com.qkm.wiki.resp.TaskcategoryQueryResp;
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
public class TaskcategoryService {

    @Resource
    private TaskcategoryMapper TaskcategoryMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<TaskcategoryQueryResp> all(){
        TaskcategoryExample categoryExample = new TaskcategoryExample();
        categoryExample.setOrderByClause("tasksort asc");
        List<Taskcategory> categoryList = TaskcategoryMapper.selectByExample(categoryExample);

        // 列表复制
        List<TaskcategoryQueryResp> list = CopyUtil.copyList(categoryList, TaskcategoryQueryResp.class);

        return list;

    }


    public PageResp<TaskcategoryQueryResp> list(TaskcategoryQueryReq req){

        TaskcategoryExample categoryExample = new TaskcategoryExample();
        categoryExample.setOrderByClause("sort asc");
        TaskcategoryExample.Criteria criteria = categoryExample.createCriteria();

        PageHelper.startPage(req.getPage(),req.getSize());
        List<Taskcategory> categoryList = TaskcategoryMapper.selectByExample(categoryExample);
        PageInfo<Taskcategory> pageInfo = new PageInfo<>(categoryList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<TaskcategoryResp> respList = new ArrayList<>();
//        for(Taskcategory category : categoryList){
////            TaskcategoryResp categoryResp = new TaskcategoryResp();
////            BeanUtils.copyProperties(category,categoryResp);
//            // 对象复制
//            TaskcategoryResp categoryResp = CopyUtil.copy(category, TaskcategoryResp.class);
//            respList.add(categoryResp);
//        }

        // 列表复制
        List<TaskcategoryQueryResp> list = CopyUtil.copyList(categoryList, TaskcategoryQueryResp.class);

        PageResp<TaskcategoryQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(TaskcategorySaveReq req){
        Taskcategory category = CopyUtil.copy(req,Taskcategory.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            category.setId(snowFlake.nextId());

            TaskcategoryMapper.insert(category);
        }else {
            // 更新
            TaskcategoryMapper.updateByPrimaryKey(category);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        TaskcategoryMapper.deleteByPrimaryKey(id);
    }
}
