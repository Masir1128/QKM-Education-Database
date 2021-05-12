package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Useradmin;
import com.qkm.wiki.domain.UseradminExample;
import com.qkm.wiki.mapper.UseradminMapper;
import com.qkm.wiki.req.UseradminQueryReq;
import com.qkm.wiki.req.UseradminSaveReq;
import com.qkm.wiki.resp.UseradminQueryResp;
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
public class UseradminService {

    @Resource
    private UseradminMapper UseradminMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<UseradminQueryResp> all(){
        UseradminExample useradminExample = new UseradminExample();
        //useradminExample.setOrderByClause("sort asc");
        List<Useradmin> useradminList = UseradminMapper.selectByExample(useradminExample);

        // 列表复制
        List<UseradminQueryResp> list = CopyUtil.copyList(useradminList, UseradminQueryResp.class);

        return list;

    }


    public PageResp<UseradminQueryResp> list(UseradminQueryReq req){

        UseradminExample useradminExample = new UseradminExample();
        //useradminExample.setOrderByClause("sort asc");
        UseradminExample.Criteria criteria = useradminExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Useradmin> useradminList = UseradminMapper.selectByExample(useradminExample);
        PageInfo<Useradmin> pageInfo = new PageInfo<>(useradminList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());


        // 列表复制
        List<UseradminQueryResp> list = CopyUtil.copyList(useradminList, UseradminQueryResp.class);

        PageResp<UseradminQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(UseradminSaveReq req){
        Useradmin useradmin = CopyUtil.copy(req,Useradmin.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            useradmin.setId(snowFlake.nextId());

            UseradminMapper.insert(useradmin);
        }else {
            // 更新
            UseradminMapper.updateByPrimaryKey(useradmin);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        UseradminMapper.deleteByPrimaryKey(id);
    }


}
