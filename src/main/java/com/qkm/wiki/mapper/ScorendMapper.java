package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Scorend;
import com.qkm.wiki.domain.ScorendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScorendMapper {
    long countByExample(ScorendExample example);

    int deleteByExample(ScorendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Scorend record);

    int insertSelective(Scorend record);

    List<Scorend> selectByExampleWithBLOBs(ScorendExample example);

    List<Scorend> selectByExample(ScorendExample example);

    Scorend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Scorend record, @Param("example") ScorendExample example);

    int updateByExampleWithBLOBs(@Param("record") Scorend record, @Param("example") ScorendExample example);

    int updateByExample(@Param("record") Scorend record, @Param("example") ScorendExample example);

    int updateByPrimaryKeySelective(Scorend record);

    int updateByPrimaryKeyWithBLOBs(Scorend record);

    int updateByPrimaryKey(Scorend record);
}