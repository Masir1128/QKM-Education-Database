package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Useradmin;
import com.qkm.wiki.domain.UseradminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseradminMapper {
    long countByExample(UseradminExample example);

    int deleteByExample(UseradminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Useradmin record);

    int insertSelective(Useradmin record);

    List<Useradmin> selectByExample(UseradminExample example);

    Useradmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Useradmin record, @Param("example") UseradminExample example);

    int updateByExample(@Param("record") Useradmin record, @Param("example") UseradminExample example);

    int updateByPrimaryKeySelective(Useradmin record);

    int updateByPrimaryKey(Useradmin record);
}