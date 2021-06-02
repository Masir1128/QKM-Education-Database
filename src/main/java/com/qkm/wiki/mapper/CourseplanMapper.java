package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Comment;
import com.qkm.wiki.domain.Courseplan;
import com.qkm.wiki.domain.CourseplanExample;
import java.util.List;

import com.qkm.wiki.resp.AbilityQueryResp;
import com.qkm.wiki.resp.CourseplanQueryResp;
import org.apache.ibatis.annotations.Param;

public interface CourseplanMapper {

    public List<Comment> list();
    long countByExample(CourseplanExample example);

    int deleteByExample(CourseplanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Courseplan record);

    int insertSelective(Courseplan record);

    List<Courseplan> selectByExample(CourseplanExample example);

    Courseplan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Courseplan record, @Param("example") CourseplanExample example);

    int updateByExample(@Param("record") Courseplan record, @Param("example") CourseplanExample example);

    int updateByPrimaryKeySelective(Courseplan record);

    int updateByPrimaryKey(Courseplan record);

    public List<CourseplanQueryResp> findid(Long id);
}