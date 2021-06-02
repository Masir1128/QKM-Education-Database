package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Zlcat1;
import com.qkm.wiki.domain.Zlcat1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Zlcat1Mapper {
    long countByExample(Zlcat1Example example);

    int deleteByExample(Zlcat1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Zlcat1 record);

    int insertSelective(Zlcat1 record);

    List<Zlcat1> selectByExample(Zlcat1Example example);

    Zlcat1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zlcat1 record, @Param("example") Zlcat1Example example);

    int updateByExample(@Param("record") Zlcat1 record, @Param("example") Zlcat1Example example);

    int updateByPrimaryKeySelective(Zlcat1 record);

    int updateByPrimaryKey(Zlcat1 record);
}