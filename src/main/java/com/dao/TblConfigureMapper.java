package com.dao;

import com.pojo.TblConfigure;
import com.pojo.TblConfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblConfigureMapper {
    int countByExample(TblConfigureExample example);

    int deleteByExample(TblConfigureExample example);

    int deleteByPrimaryKey(String configureid);

    int insert(TblConfigure record);

    int insertSelective(TblConfigure record);

    List<TblConfigure> selectByExample(TblConfigureExample example);

    TblConfigure selectByPrimaryKey(String configureid);

    int updateByExampleSelective(@Param("record") TblConfigure record, @Param("example") TblConfigureExample example);

    int updateByExample(@Param("record") TblConfigure record, @Param("example") TblConfigureExample example);

    int updateByPrimaryKeySelective(TblConfigure record);

    int updateByPrimaryKey(TblConfigure record);
}