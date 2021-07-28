package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Userzl;
import com.qkm.wiki.domain.UserzlExample;
import com.qkm.wiki.req.UserzlQueryReq;
import com.qkm.wiki.req.UserzlSaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.UserzlQueryResp;
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
public class UserzlService {

    @Resource
    private com.qkm.wiki.mapper.UserzlMapper UserzlMapper;

    @Resource
    private SnowFlake snowFlake ;


    public List<UserzlQueryResp> all(){
        UserzlExample userzlExample = new UserzlExample();
        //userzlExample.setOrderByClause("sort asc");
        List<Userzl> userzlList = UserzlMapper.selectByExample(userzlExample);

        // 列表复制
        List<UserzlQueryResp> list = CopyUtil.copyList(userzlList, UserzlQueryResp.class);

        return list;

    }


    public PageResp<UserzlQueryResp> list(UserzlQueryReq req){

        UserzlExample userzlExample = new UserzlExample();
        //userzlExample.setOrderByClause("sort asc");
        UserzlExample.Criteria criteria = userzlExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Userzl> userzlList = UserzlMapper.selectByExample(userzlExample);
        PageInfo<Userzl> pageInfo = new PageInfo<>(userzlList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<UserzlResp> respList = new ArrayList<>();
//        for(Userzl userzl : userzlList){
////            UserzlResp userzlResp = new UserzlResp();
////            BeanUtils.copyProperties(userzl,userzlResp);
//            // 对象复制
//            UserzlResp userzlResp = CopyUtil.copy(userzl, UserzlResp.class);
//            respList.add(userzlResp);
//        }

        // 列表复制
        List<UserzlQueryResp> list = CopyUtil.copyList(userzlList, UserzlQueryResp.class);

        PageResp<UserzlQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(UserzlSaveReq req){
        Userzl userzl = CopyUtil.copy(req,Userzl.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            userzl.setId(snowFlake.nextId());

            UserzlMapper.insert(userzl);
        }else {
            // 更新
            UserzlMapper.updateByPrimaryKey(userzl);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        UserzlMapper.deleteByPrimaryKey(id);
    }



}
