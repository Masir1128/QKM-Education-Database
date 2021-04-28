package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Ability;
import com.qkm.wiki.domain.AbilityExample;
import java.util.List;

import com.qkm.wiki.resp.AbilityQueryResp;
import com.qkm.wiki.resp.CommentQueryResp;
import com.qkm.wiki.resp.ScoreQueryResp;
import org.apache.ibatis.annotations.Param;

public interface AbilityMapper {
    long countByExample(AbilityExample example);

    int deleteByExample(AbilityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ability record);

    int insertSelective(Ability record);

    List<Ability> selectByExampleWithBLOBs(AbilityExample example);

    List<Ability> selectByExample(AbilityExample example);

    Ability selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ability record, @Param("example") AbilityExample example);

    int updateByExampleWithBLOBs(@Param("record") Ability record, @Param("example") AbilityExample example);

    int updateByExample(@Param("record") Ability record, @Param("example") AbilityExample example);

    int updateByPrimaryKeySelective(Ability record);

    int updateByPrimaryKeyWithBLOBs(Ability record);

    int updateByPrimaryKey(Ability record);

    public List<AbilityQueryResp> selectScoreByCondition(String name, String qishu, String num);

    public List<AbilityQueryResp> findname(String names);

    public List<AbilityQueryResp> findsort(String num);

    public List<AbilityQueryResp> findaverage(String num);

    public List<AbilityQueryResp> conclude(String name, String task, String num);
}
