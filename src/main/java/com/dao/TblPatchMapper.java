package com.dao;

import com.pojo.TblPatch;
import com.pojo.TblPatchExample;
import com.pojo.TblPatchWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblPatchMapper {
    int countByExample(TblPatchExample example);

    int deleteByExample(TblPatchExample example);

    int deleteByPrimaryKey(String configureid);

    int insert(TblPatchWithBLOBs record);

    int insertSelective(TblPatchWithBLOBs record);

    List<TblPatchWithBLOBs> selectByExampleWithBLOBs(TblPatchExample example);

    List<TblPatch> selectByExample(TblPatchExample example);

    TblPatchWithBLOBs selectByPrimaryKey(String configureid);

    int updateByExampleSelective(@Param("record") TblPatchWithBLOBs record, @Param("example") TblPatchExample example);

    int updateByExampleWithBLOBs(@Param("record") TblPatchWithBLOBs record, @Param("example") TblPatchExample example);

    int updateByExample(@Param("record") TblPatch record, @Param("example") TblPatchExample example);

    int updateByPrimaryKeySelective(TblPatchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TblPatchWithBLOBs record);

    int updateByPrimaryKey(TblPatch record);
}