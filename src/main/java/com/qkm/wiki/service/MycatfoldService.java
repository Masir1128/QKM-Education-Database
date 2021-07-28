package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Mycatfold;
import com.qkm.wiki.domain.MycatfoldExample;
import com.qkm.wiki.req.MycatfoldQueryReq;
import com.qkm.wiki.req.MycatfoldSaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.MycatfoldQueryResp;
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
public class MycatfoldService {

    @Resource
    private com.qkm.wiki.mapper.MycatfoldMapper MycatfoldMapper;

    @Resource
    private SnowFlake snowFlake ;


    public List<MycatfoldQueryResp> all(){
        MycatfoldExample mycatfoldExample = new MycatfoldExample();
        //mycatfoldExample.setOrderByClause("sort asc");
        List<Mycatfold> mycatfoldList = MycatfoldMapper.selectByExample(mycatfoldExample);

        // 列表复制
        List<MycatfoldQueryResp> list = CopyUtil.copyList(mycatfoldList, MycatfoldQueryResp.class);

        return list;

    }


    public PageResp<MycatfoldQueryResp> list(MycatfoldQueryReq req){

        MycatfoldExample mycatfoldExample = new MycatfoldExample();
        //mycatfoldExample.setOrderByClause("sort asc");
        MycatfoldExample.Criteria criteria = mycatfoldExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Mycatfold> mycatfoldList = MycatfoldMapper.selectByExample(mycatfoldExample);
        PageInfo<Mycatfold> pageInfo = new PageInfo<>(mycatfoldList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<MycatfoldResp> respList = new ArrayList<>();
//        for(Mycatfold mycatfold : mycatfoldList){
////            MycatfoldResp mycatfoldResp = new MycatfoldResp();
////            BeanUtils.copyProperties(mycatfold,mycatfoldResp);
//            // 对象复制
//            MycatfoldResp mycatfoldResp = CopyUtil.copy(mycatfold, MycatfoldResp.class);
//            respList.add(mycatfoldResp);
//        }

        // 列表复制
        List<MycatfoldQueryResp> list = CopyUtil.copyList(mycatfoldList, MycatfoldQueryResp.class);

        PageResp<MycatfoldQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(MycatfoldSaveReq req){
        Mycatfold mycatfold = CopyUtil.copy(req,Mycatfold.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            mycatfold.setId(snowFlake.nextId());

            MycatfoldMapper.insert(mycatfold);
        }else {
            // 更新
            MycatfoldMapper.updateByPrimaryKey(mycatfold);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        MycatfoldMapper.deleteByPrimaryKey(id);
    }



}
