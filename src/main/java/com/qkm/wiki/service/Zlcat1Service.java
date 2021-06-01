package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Zlcat1;
import com.qkm.wiki.domain.Zlcat1Example;
import com.qkm.wiki.mapper.Zlcat1Mapper;
import com.qkm.wiki.req.Zlcat1QueryReq;
import com.qkm.wiki.req.Zlcat1SaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.Zlcat1QueryResp;
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
public class Zlcat1Service {

    @Resource
    private Zlcat1Mapper Zlcat1Mapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<Zlcat1QueryResp> all(){
        Zlcat1Example zlcat1Example = new Zlcat1Example();
        //zlcat1Example.setOrderByClause("sort asc");
        List<Zlcat1> zlcat1List = Zlcat1Mapper.selectByExample(zlcat1Example);

        // 列表复制
        List<Zlcat1QueryResp> list = CopyUtil.copyList(zlcat1List, Zlcat1QueryResp.class);

        return list;

    }


    public PageResp<Zlcat1QueryResp> list(Zlcat1QueryReq req){

        Zlcat1Example zlcat1Example = new Zlcat1Example();
        //zlcat1Example.setOrderByClause("sort asc");
        Zlcat1Example.Criteria criteria = zlcat1Example.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Zlcat1> zlcat1List = Zlcat1Mapper.selectByExample(zlcat1Example);
        PageInfo<Zlcat1> pageInfo = new PageInfo<>(zlcat1List);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<Zlcat1Resp> respList = new ArrayList<>();
//        for(Zlcat1 zlcat1 : zlcat1List){
////            Zlcat1Resp zlcat1Resp = new Zlcat1Resp();
////            BeanUtils.copyProperties(zlcat1,zlcat1Resp);
//            // 对象复制
//            Zlcat1Resp zlcat1Resp = CopyUtil.copy(zlcat1, Zlcat1Resp.class);
//            respList.add(zlcat1Resp);
//        }

        // 列表复制
        List<Zlcat1QueryResp> list = CopyUtil.copyList(zlcat1List, Zlcat1QueryResp.class);

        PageResp<Zlcat1QueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(Zlcat1SaveReq req){
        Zlcat1 zlcat1 = CopyUtil.copy(req,Zlcat1.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            zlcat1.setId(snowFlake.nextId());

            Zlcat1Mapper.insert(zlcat1);
        }else {
            // 更新
            Zlcat1Mapper.updateByPrimaryKey(zlcat1);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        Zlcat1Mapper.deleteByPrimaryKey(id);
    }
}
