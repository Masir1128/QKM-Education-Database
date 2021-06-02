package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Zlcat2;
import com.qkm.wiki.domain.Zlcat2Example;
import java.util.List;

import com.qkm.wiki.resp.TrainingQueryResp;
import com.qkm.wiki.resp.Zlcat2QueryResp;
import org.apache.ibatis.annotations.Param;

public interface Zlcat2Mapper {
    long countByExample(Zlcat2Example example);

    int deleteByExample(Zlcat2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Zlcat2 record);

    int insertSelective(Zlcat2 record);

    List<Zlcat2> selectByExample(Zlcat2Example example);

    Zlcat2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zlcat2 record, @Param("example") Zlcat2Example example);

    int updateByExample(@Param("record") Zlcat2 record, @Param("example") Zlcat2Example example);

    int updateByPrimaryKeySelective(Zlcat2 record);

    int updateByPrimaryKey(Zlcat2 record);

    public List<Zlcat2QueryResp> findcat(String cat);
}