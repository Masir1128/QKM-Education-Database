package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Scorend;
import com.qkm.wiki.domain.ScorendExample;
import com.qkm.wiki.mapper.ScorendMapper;
import com.qkm.wiki.req.ScorendQueryReq;
import com.qkm.wiki.req.ScorendSaveReq;
import com.qkm.wiki.resp.ScorendQueryResp;
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
public class ScorendService {

    @Resource
    private ScorendMapper ScorendMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<ScorendQueryResp> all(){
        ScorendExample scorendExample = new ScorendExample();
        //scorendExample.setOrderByClause("sort asc");
        List<Scorend> scorendList = ScorendMapper.selectByExample(scorendExample);

        // 列表复制
        List<ScorendQueryResp> list = CopyUtil.copyList(scorendList, ScorendQueryResp.class);

        return list;

    }


    public PageResp<ScorendQueryResp> list(ScorendQueryReq req){

        ScorendExample scorendExample = new ScorendExample();
        //scorendExample.setOrderByClause("sort asc");
        ScorendExample.Criteria criteria = scorendExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Scorend> scorendList = ScorendMapper.selectByExample(scorendExample);
        PageInfo<Scorend> pageInfo = new PageInfo<>(scorendList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<ScorendResp> respList = new ArrayList<>();
//        for(Scorend scorend : scorendList){
////            ScorendResp scorendResp = new ScorendResp();
////            BeanUtils.copyProperties(scorend,scorendResp);
//            // 对象复制
//            ScorendResp scorendResp = CopyUtil.copy(scorend, ScorendResp.class);
//            respList.add(scorendResp);
//        }

        // 列表复制
        List<ScorendQueryResp> list = CopyUtil.copyList(scorendList, ScorendQueryResp.class);

        PageResp<ScorendQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(ScorendSaveReq req){
        Scorend scorend = CopyUtil.copy(req,Scorend.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            scorend.setId(snowFlake.nextId());

            ScorendMapper.insert(scorend);
        }else {
            // 更新
            ScorendMapper.updateByPrimaryKey(scorend);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        ScorendMapper.deleteByPrimaryKey(id);
    }



}
