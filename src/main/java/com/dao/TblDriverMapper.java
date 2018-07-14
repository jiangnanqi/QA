package com.dao;

import com.pojo.TblDriver;
import com.pojo.TblDriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDriverMapper {
    int countByExample(TblDriverExample example);

    int deleteByExample(TblDriverExample example);

    int deleteByPrimaryKey(String configureid);

    int insert(TblDriver record);

    int insertSelective(TblDriver record);

    List<TblDriver> selectByExampleWithBLOBs(TblDriverExample example);

    List<TblDriver> selectByExample(TblDriverExample example);

    TblDriver selectByPrimaryKey(String configureid);

    int updateByExampleSelective(@Param("record") TblDriver record, @Param("example") TblDriverExample example);

    int updateByExampleWithBLOBs(@Param("record") TblDriver record, @Param("example") TblDriverExample example);

    int updateByExample(@Param("record") TblDriver record, @Param("example") TblDriverExample example);

    int updateByPrimaryKeySelective(TblDriver record);

    int updateByPrimaryKeyWithBLOBs(TblDriver record);

    int updateByPrimaryKey(TblDriver record);
}