package com.dao;

import com.pojo.TblComputer;
import com.pojo.TblComputerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblComputerMapper {
    int countByExample(TblComputerExample example);

    int deleteByExample(TblComputerExample example);

    int deleteByPrimaryKey(String equipmentid);

    int insert(TblComputer record);

    int insertSelective(TblComputer record);

    List<TblComputer> selectByExample(TblComputerExample example);

    TblComputer selectByPrimaryKey(String equipmentid);

    int updateByExampleSelective(@Param("record") TblComputer record, @Param("example") TblComputerExample example);

    int updateByExample(@Param("record") TblComputer record, @Param("example") TblComputerExample example);

    int updateByPrimaryKeySelective(TblComputer record);

    int updateByPrimaryKey(TblComputer record);
}