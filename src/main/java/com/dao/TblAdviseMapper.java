package com.dao;

import com.pojo.TblAdvise;
import com.pojo.TblAdviseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAdviseMapper {
    int countByExample(TblAdviseExample example);

    int deleteByExample(TblAdviseExample example);

    int deleteByPrimaryKey(String adviseid);

    int insert(TblAdvise record);

    int insertSelective(TblAdvise record);

    List<TblAdvise> selectByExample(TblAdviseExample example);

    TblAdvise selectByPrimaryKey(String adviseid);

    int updateByExampleSelective(@Param("record") TblAdvise record, @Param("example") TblAdviseExample example);

    int updateByExample(@Param("record") TblAdvise record, @Param("example") TblAdviseExample example);

    int updateByPrimaryKeySelective(TblAdvise record);

    int updateByPrimaryKey(TblAdvise record);
}