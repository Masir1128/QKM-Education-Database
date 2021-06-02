package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Zlcat3;
import com.qkm.wiki.domain.Zlcat3Example;
import java.util.List;

import com.qkm.wiki.resp.Zlcat2QueryResp;
import com.qkm.wiki.resp.Zlcat3QueryResp;
import org.apache.ibatis.annotations.Param;

public interface Zlcat3Mapper {
    long countByExample(Zlcat3Example example);

    int deleteByExample(Zlcat3Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Zlcat3 record);

    int insertSelective(Zlcat3 record);

    List<Zlcat3> selectByExample(Zlcat3Example example);

    Zlcat3 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zlcat3 record, @Param("example") Zlcat3Example example);

    int updateByExample(@Param("record") Zlcat3 record, @Param("example") Zlcat3Example example);

    int updateByPrimaryKeySelective(Zlcat3 record);

    int updateByPrimaryKey(Zlcat3 record);

    public List<Zlcat3QueryResp> findcat(String cat);

}