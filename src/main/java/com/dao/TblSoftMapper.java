package com.dao;

import com.pojo.TblSoft;
import com.pojo.TblSoftExample;
import com.pojo.TblSoftWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSoftMapper {
    int countByExample(TblSoftExample example);

    int deleteByExample(TblSoftExample example);

    int deleteByPrimaryKey(String configureid);

    int insert(TblSoftWithBLOBs record);

    int insertSelective(TblSoftWithBLOBs record);

    List<TblSoftWithBLOBs> selectByExampleWithBLOBs(TblSoftExample example);

    List<TblSoft> selectByExample(TblSoftExample example);

    TblSoftWithBLOBs selectByPrimaryKey(String configureid);

    int updateByExampleSelective(@Param("record") TblSoftWithBLOBs record, @Param("example") TblSoftExample example);

    int updateByExampleWithBLOBs(@Param("record") TblSoftWithBLOBs record, @Param("example") TblSoftExample example);

    int updateByExample(@Param("record") TblSoft record, @Param("example") TblSoftExample example);

    int updateByPrimaryKeySelective(TblSoftWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TblSoftWithBLOBs record);

    int updateByPrimaryKey(TblSoft record);
}