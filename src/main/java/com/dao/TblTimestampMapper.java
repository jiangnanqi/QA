package com.dao;

import com.pojo.TblTimestamp;
import com.pojo.TblTimestampExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblTimestampMapper {
    int countByExample(TblTimestampExample example);

    int deleteByExample(TblTimestampExample example);

    int deleteByPrimaryKey(String timeid);

    int insert(TblTimestamp record);

    int insertSelective(TblTimestamp record);

    List<TblTimestamp> selectByExample(TblTimestampExample example);

    TblTimestamp selectByPrimaryKey(String timeid);

    int updateByExampleSelective(@Param("record") TblTimestamp record, @Param("example") TblTimestampExample example);

    int updateByExample(@Param("record") TblTimestamp record, @Param("example") TblTimestampExample example);

    int updateByPrimaryKeySelective(TblTimestamp record);

    int updateByPrimaryKey(TblTimestamp record);
}