package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Comment;
import com.qkm.wiki.domain.CommentExample;
import java.util.List;

import com.qkm.wiki.domain.Tstask2;
import com.qkm.wiki.domain.Tstask4;
import com.qkm.wiki.resp.CommentQueryResp;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {

    public List<Comment> list();

    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);

    public List<CommentQueryResp> findebookid(Long ebookid);
}