package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Zlcat3;
import com.qkm.wiki.domain.Zlcat3Example;
import com.qkm.wiki.mapper.Zlcat3Mapper;
import com.qkm.wiki.req.Zlcat3QueryReq;
import com.qkm.wiki.req.Zlcat3SaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.Zlcat2QueryResp;
import com.qkm.wiki.resp.Zlcat3QueryResp;
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
public class Zlcat3Service {

    @Resource
    private Zlcat3Mapper Zlcat3Mapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<Zlcat3QueryResp> all(){
        Zlcat3Example zlcat3Example = new Zlcat3Example();
        //zlcat3Example.setOrderByClause("sort asc");
        List<Zlcat3> zlcat3List = Zlcat3Mapper.selectByExample(zlcat3Example);

        // 列表复制
        List<Zlcat3QueryResp> list = CopyUtil.copyList(zlcat3List, Zlcat3QueryResp.class);

        return list;

    }


    public PageResp<Zlcat3QueryResp> list(Zlcat3QueryReq req){

        Zlcat3Example zlcat3Example = new Zlcat3Example();
        //zlcat3Example.setOrderByClause("sort asc");
        Zlcat3Example.Criteria criteria = zlcat3Example.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Zlcat3> zlcat3List = Zlcat3Mapper.selectByExample(zlcat3Example);
        PageInfo<Zlcat3> pageInfo = new PageInfo<>(zlcat3List);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<Zlcat3Resp> respList = new ArrayList<>();
//        for(Zlcat3 zlcat3 : zlcat3List){
////            Zlcat3Resp zlcat3Resp = new Zlcat3Resp();
////            BeanUtils.copyProperties(zlcat3,zlcat3Resp);
//            // 对象复制
//            Zlcat3Resp zlcat3Resp = CopyUtil.copy(zlcat3, Zlcat3Resp.class);
//            respList.add(zlcat3Resp);
//        }

        // 列表复制
        List<Zlcat3QueryResp> list = CopyUtil.copyList(zlcat3List, Zlcat3QueryResp.class);

        PageResp<Zlcat3QueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(Zlcat3SaveReq req){
        Zlcat3 zlcat3 = CopyUtil.copy(req,Zlcat3.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            zlcat3.setId(snowFlake.nextId());

            Zlcat3Mapper.insert(zlcat3);
        }else {
            // 更新
            Zlcat3Mapper.updateByPrimaryKey(zlcat3);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        Zlcat3Mapper.deleteByPrimaryKey(id);
    }

    public List<Zlcat3QueryResp> findcat(String cat){
        return Zlcat3Mapper.findcat(cat);
    }


}
