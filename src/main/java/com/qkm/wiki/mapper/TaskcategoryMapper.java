package com.qkm.wiki.mapper;

import com.qkm.wiki.domain.Taskcategory;
import com.qkm.wiki.domain.TaskcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskcategoryMapper {
    long countByExample(TaskcategoryExample example);

    int deleteByExample(TaskcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Taskcategory record);

    int insertSelective(Taskcategory record);

    List<Taskcategory> selectByExample(TaskcategoryExample example);

    Taskcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Taskcategory record, @Param("example") TaskcategoryExample example);

    int updateByExample(@Param("record") Taskcategory record, @Param("example") TaskcategoryExample example);

    int updateByPrimaryKeySelective(Taskcategory record);

    int updateByPrimaryKey(Taskcategory record);
}