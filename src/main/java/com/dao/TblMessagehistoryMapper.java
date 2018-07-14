package com.dao;

import com.pojo.TblMessagehistory;
import com.pojo.TblMessagehistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblMessagehistoryMapper {
    int countByExample(TblMessagehistoryExample example);

    int deleteByExample(TblMessagehistoryExample example);

    int deleteByPrimaryKey(String messagehistoryid);

    int insert(TblMessagehistory record);

    int insertSelective(TblMessagehistory record);

    List<TblMessagehistory> selectByExample(TblMessagehistoryExample example);

    TblMessagehistory selectByPrimaryKey(String messagehistoryid);

    int updateByExampleSelective(@Param("record") TblMessagehistory record, @Param("example") TblMessagehistoryExample example);

    int updateByExample(@Param("record") TblMessagehistory record, @Param("example") TblMessagehistoryExample example);

    int updateByPrimaryKeySelective(TblMessagehistory record);

    int updateByPrimaryKey(TblMessagehistory record);
}