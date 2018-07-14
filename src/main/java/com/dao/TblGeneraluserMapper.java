package com.dao;

import com.pojo.TblGeneraluser;
import com.pojo.TblGeneraluserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblGeneraluserMapper {
    int countByExample(TblGeneraluserExample example);

    int deleteByExample(TblGeneraluserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(TblGeneraluser record);

    int insertSelective(TblGeneraluser record);

    List<TblGeneraluser> selectByExample(TblGeneraluserExample example);

    TblGeneraluser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") TblGeneraluser record, @Param("example") TblGeneraluserExample example);

    int updateByExample(@Param("record") TblGeneraluser record, @Param("example") TblGeneraluserExample example);

    int updateByPrimaryKeySelective(TblGeneraluser record);

    int updateByPrimaryKey(TblGeneraluser record);
}