package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Score;
import com.qkm.wiki.domain.ScoreExample;
import java.util.List;

import com.qkm.wiki.resp.ScoreQueryResp;
import com.qkm.wiki.resp.StatisticResp;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    long countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    public List<ScoreQueryResp> selectScoreByCondition(String name,String parents);

    public List<ScoreQueryResp> findname(String names);
}