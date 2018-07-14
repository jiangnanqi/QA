package com.dao;

import com.pojo.TblAgree;
import com.pojo.TblAgreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAgreeMapper {
    int countByExample(TblAgreeExample example);

    int deleteByExample(TblAgreeExample example);

    int deleteByPrimaryKey(String agreeid);

    int insert(TblAgree record);

    int insertSelective(TblAgree record);

    List<TblAgree> selectByExample(TblAgreeExample example);

    TblAgree selectByPrimaryKey(String agreeid);

    int updateByExampleSelective(@Param("record") TblAgree record, @Param("example") TblAgreeExample example);

    int updateByExample(@Param("record") TblAgree record, @Param("example") TblAgreeExample example);

    int updateByPrimaryKeySelective(TblAgree record);

    int updateByPrimaryKey(TblAgree record);
}