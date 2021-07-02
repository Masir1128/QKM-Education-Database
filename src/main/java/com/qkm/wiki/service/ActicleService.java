package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Acticle;
import com.qkm.wiki.domain.ActicleExample;
import com.qkm.wiki.mapper.ActicleMapper;
import com.qkm.wiki.req.ActicleQueryReq;
import com.qkm.wiki.req.ActicleSaveReq;
import com.qkm.wiki.resp.CommentQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.ActicleQueryResp;
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
public class ActicleService {

    @Resource
    private ActicleMapper ActicleMapper;

    @Resource
    private SnowFlake snowFlake ;


    public List<ActicleQueryResp> all(){
        ActicleExample commentExample = new ActicleExample();
        //commentExample.setOrderByClause("sort asc");
        List<Acticle> commentList = ActicleMapper.selectByExample(commentExample);

        // 列表复制
        List<ActicleQueryResp> list = CopyUtil.copyList(commentList, ActicleQueryResp.class);

        return list;

    }


    public PageResp<ActicleQueryResp> list(ActicleQueryReq req){

        ActicleExample commentExample = new ActicleExample();
        //commentExample.setOrderByClause("sort asc");
        ActicleExample.Criteria criteria = commentExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Acticle> commentList = ActicleMapper.selectByExample(commentExample);
        PageInfo<Acticle> pageInfo = new PageInfo<>(commentList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<ActicleResp> respList = new ArrayList<>();
//        for(Acticle comment : commentList){
////            ActicleResp commentResp = new ActicleResp();
////            BeanUtils.copyProperties(comment,commentResp);
//            // 对象复制
//            ActicleResp commentResp = CopyUtil.copy(comment, ActicleResp.class);
//            respList.add(commentResp);
//        }

        // 列表复制
        List<ActicleQueryResp> list = CopyUtil.copyList(commentList, ActicleQueryResp.class);

        PageResp<ActicleQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(ActicleSaveReq req){
        Acticle comment = CopyUtil.copy(req,Acticle.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            comment.setId(snowFlake.nextId());

            ActicleMapper.insert(comment);
        }else {
            // 更新
            ActicleMapper.updateByPrimaryKey(comment);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        ActicleMapper.deleteByPrimaryKey(id);
    }


    /**
     * 查询
     */
    public List<ActicleQueryResp> findebookid(Long ebookid){
        return ActicleMapper.findebookid(ebookid);
    }


}
