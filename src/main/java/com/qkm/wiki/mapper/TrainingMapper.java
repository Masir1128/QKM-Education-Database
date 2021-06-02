package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Training;
import com.qkm.wiki.domain.TrainingExample;
import java.util.List;

import com.qkm.wiki.resp.TrainingQueryResp;
import org.apache.ibatis.annotations.Param;

public interface TrainingMapper {
    long countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKey(Training record);

    public List<TrainingQueryResp> findlevel(String level);

    public List<TrainingQueryResp> findCapLevel(String level,String name);
}