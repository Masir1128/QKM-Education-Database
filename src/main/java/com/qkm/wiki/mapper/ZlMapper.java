package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Zl;
import com.qkm.wiki.domain.ZlExample;
import java.util.List;

import com.qkm.wiki.resp.ZlQueryResp;
import com.qkm.wiki.resp.Zlcat3QueryResp;
import org.apache.ibatis.annotations.Param;

public interface ZlMapper {
    long countByExample(ZlExample example);

    int deleteByExample(ZlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Zl record);

    int insertSelective(Zl record);

    List<Zl> selectByExample(ZlExample example);

    Zl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByExample(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByPrimaryKeySelective(Zl record);

    int updateByPrimaryKey(Zl record);

    public List<ZlQueryResp> findcat(String cat);

    public List<ZlQueryResp> findid(Long id);

    public List<ZlQueryResp> findpersonal(String namer);
}