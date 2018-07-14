package com.dao;

import com.pojo.TblShare;
import com.pojo.TblShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblShareMapper {
    int countByExample(TblShareExample example);

    int deleteByExample(TblShareExample example);

    int deleteByPrimaryKey(String shareid);

    int insert(TblShare record);

    int insertSelective(TblShare record);

    List<TblShare> selectByExample(TblShareExample example);

    TblShare selectByPrimaryKey(String shareid);

    int updateByExampleSelective(@Param("record") TblShare record, @Param("example") TblShareExample example);

    int updateByExample(@Param("record") TblShare record, @Param("example") TblShareExample example);

    int updateByPrimaryKeySelective(TblShare record);

    int updateByPrimaryKey(TblShare record);
}