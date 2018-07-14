package com.dao;

import com.pojo.TblConfigurehistory;
import com.pojo.TblConfigurehistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblConfigurehistoryMapper {
    int countByExample(TblConfigurehistoryExample example);

    int deleteByExample(TblConfigurehistoryExample example);

    int deleteByPrimaryKey(String configurehistoryid);

    int insert(TblConfigurehistory record);

    int insertSelective(TblConfigurehistory record);

    List<TblConfigurehistory> selectByExampleWithBLOBs(TblConfigurehistoryExample example);

    List<TblConfigurehistory> selectByExample(TblConfigurehistoryExample example);

    TblConfigurehistory selectByPrimaryKey(String configurehistoryid);

    int updateByExampleSelective(@Param("record") TblConfigurehistory record, @Param("example") TblConfigurehistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") TblConfigurehistory record, @Param("example") TblConfigurehistoryExample example);

    int updateByExample(@Param("record") TblConfigurehistory record, @Param("example") TblConfigurehistoryExample example);

    int updateByPrimaryKeySelective(TblConfigurehistory record);

    int updateByPrimaryKeyWithBLOBs(TblConfigurehistory record);

    int updateByPrimaryKey(TblConfigurehistory record);
}