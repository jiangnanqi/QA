package com.dao;

import com.pojo.TblLog;
import com.pojo.TblLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblLogMapper {
    int countByExample(TblLogExample example);

    int deleteByExample(TblLogExample example);

    int deleteByPrimaryKey(String logid);

    int insert(TblLog record);

    int insertSelective(TblLog record);

    List<TblLog> selectByExample(TblLogExample example);

    TblLog selectByPrimaryKey(String logid);

    int updateByExampleSelective(@Param("record") TblLog record, @Param("example") TblLogExample example);

    int updateByExample(@Param("record") TblLog record, @Param("example") TblLogExample example);

    int updateByPrimaryKeySelective(TblLog record);

    int updateByPrimaryKey(TblLog record);
}