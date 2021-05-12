package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Courseplan;
import com.qkm.wiki.domain.CourseplanExample;
import com.qkm.wiki.mapper.CourseplanMapper;
import com.qkm.wiki.req.CourseplanQueryReq;
import com.qkm.wiki.req.CourseplanSaveReq;
import com.qkm.wiki.resp.AbilityQueryResp;
import com.qkm.wiki.resp.CourseplanQueryResp;
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
public class CourseplanService {

    @Resource
    private CourseplanMapper CourseplanMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<CourseplanQueryResp> all(Long id){
        CourseplanExample courseplanExample = new CourseplanExample();
        courseplanExample.createCriteria().andIdEqualTo(id);
        List<Courseplan> courseplanList = CourseplanMapper.selectByExample(courseplanExample);

        // 列表复制
        List<CourseplanQueryResp> list = CopyUtil.copyList(courseplanList, CourseplanQueryResp.class);

        return list;

    }


    public PageResp<CourseplanQueryResp> list(CourseplanQueryReq req){

        CourseplanExample courseplanExample = new CourseplanExample();
        //courseplanExample.setOrderByClause("sort asc");
        CourseplanExample.Criteria criteria = courseplanExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Courseplan> courseplanList = CourseplanMapper.selectByExample(courseplanExample);
        PageInfo<Courseplan> pageInfo = new PageInfo<>(courseplanList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<CourseplanResp> respList = new ArrayList<>();
//        for(Courseplan courseplan : courseplanList){
////            CourseplanResp courseplanResp = new CourseplanResp();
////            BeanUtils.copyProperties(courseplan,courseplanResp);
//            // 对象复制
//            CourseplanResp courseplanResp = CopyUtil.copy(courseplan, CourseplanResp.class);
//            respList.add(courseplanResp);
//        }

        // 列表复制
        List<CourseplanQueryResp> list = CopyUtil.copyList(courseplanList, CourseplanQueryResp.class);

        PageResp<CourseplanQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(CourseplanSaveReq req){
        Courseplan courseplan = CopyUtil.copy(req,Courseplan.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            courseplan.setId(snowFlake.nextId());

            CourseplanMapper.insert(courseplan);
        }else {
            // 更新
            CourseplanMapper.updateByPrimaryKey(courseplan);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        CourseplanMapper.deleteByPrimaryKey(id);
    }


    public List<CourseplanQueryResp> findid(Long id){
        return CourseplanMapper.findid(id);
    }


}
