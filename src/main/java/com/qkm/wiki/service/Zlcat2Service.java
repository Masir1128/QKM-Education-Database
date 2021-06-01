package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Zlcat2;
import com.qkm.wiki.domain.Zlcat2Example;
import com.qkm.wiki.mapper.Zlcat2Mapper;
import com.qkm.wiki.req.Zlcat2QueryReq;
import com.qkm.wiki.req.Zlcat2SaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.TrainingQueryResp;
import com.qkm.wiki.resp.Zlcat2QueryResp;
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
public class Zlcat2Service {

    @Resource
    private Zlcat2Mapper Zlcat2Mapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<Zlcat2QueryResp> all(){
        Zlcat2Example zlcat2Example = new Zlcat2Example();
        //zlcat2Example.setOrderByClause("sort asc");
        List<Zlcat2> zlcat2List = Zlcat2Mapper.selectByExample(zlcat2Example);

        // 列表复制
        List<Zlcat2QueryResp> list = CopyUtil.copyList(zlcat2List, Zlcat2QueryResp.class);

        return list;

    }


    public PageResp<Zlcat2QueryResp> list(Zlcat2QueryReq req){

        Zlcat2Example zlcat2Example = new Zlcat2Example();
        //zlcat2Example.setOrderByClause("sort asc");
        Zlcat2Example.Criteria criteria = zlcat2Example.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Zlcat2> zlcat2List = Zlcat2Mapper.selectByExample(zlcat2Example);
        PageInfo<Zlcat2> pageInfo = new PageInfo<>(zlcat2List);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<Zlcat2Resp> respList = new ArrayList<>();
//        for(Zlcat2 zlcat2 : zlcat2List){
////            Zlcat2Resp zlcat2Resp = new Zlcat2Resp();
////            BeanUtils.copyProperties(zlcat2,zlcat2Resp);
//            // 对象复制
//            Zlcat2Resp zlcat2Resp = CopyUtil.copy(zlcat2, Zlcat2Resp.class);
//            respList.add(zlcat2Resp);
//        }

        // 列表复制
        List<Zlcat2QueryResp> list = CopyUtil.copyList(zlcat2List, Zlcat2QueryResp.class);

        PageResp<Zlcat2QueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(Zlcat2SaveReq req){
        Zlcat2 zlcat2 = CopyUtil.copy(req,Zlcat2.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            zlcat2.setId(snowFlake.nextId());

            Zlcat2Mapper.insert(zlcat2);
        }else {
            // 更新
            Zlcat2Mapper.updateByPrimaryKey(zlcat2);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        Zlcat2Mapper.deleteByPrimaryKey(id);
    }

    public List<Zlcat2QueryResp> findcat(String cat){
        return Zlcat2Mapper.findcat(cat);
    }
}
