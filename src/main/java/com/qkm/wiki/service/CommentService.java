package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.*;
import com.qkm.wiki.mapper.CommentMapper;
import com.qkm.wiki.req.CommentQueryReq;
import com.qkm.wiki.req.CommentSaveReq;
import com.qkm.wiki.resp.CommentQueryResp;
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
public class CommentService {

    @Resource
    private CommentMapper CommentMapper;

    @Resource
    private SnowFlake snowFlake ;


    public List<Comment> list(){
        return CommentMapper.list();
    }


    public List<CommentQueryResp> all(){
        CommentExample commentExample = new CommentExample();
        //commentExample.setOrderByClause("sort asc");
        List<Comment> commentList = CommentMapper.selectByExample(commentExample);

        // 列表复制
        List<CommentQueryResp> list = CopyUtil.copyList(commentList, CommentQueryResp.class);

        return list;

    }


    public PageResp<CommentQueryResp> list(CommentQueryReq req){

        CommentExample commentExample = new CommentExample();
        //commentExample.setOrderByClause("sort asc");
        CommentExample.Criteria criteria = commentExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Comment> commentList = CommentMapper.selectByExample(commentExample);
        PageInfo<Comment> pageInfo = new PageInfo<>(commentList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<CommentResp> respList = new ArrayList<>();
//        for(Comment comment : commentList){
////            CommentResp commentResp = new CommentResp();
////            BeanUtils.copyProperties(comment,commentResp);
//            // 对象复制
//            CommentResp commentResp = CopyUtil.copy(comment, CommentResp.class);
//            respList.add(commentResp);
//        }

        // 列表复制
        List<CommentQueryResp> list = CopyUtil.copyList(commentList, CommentQueryResp.class);

        PageResp<CommentQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(CommentSaveReq req){
        Comment comment = CopyUtil.copy(req,Comment.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            comment.setId(snowFlake.nextId());

            CommentMapper.insert(comment);
        }else {
            // 更新
            CommentMapper.updateByPrimaryKey(comment);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        CommentMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询
     */
    public List<CommentQueryResp> findebookid(Long ebookid){
        return CommentMapper.findebookid(ebookid);
    }


}
