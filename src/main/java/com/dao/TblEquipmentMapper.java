package com.dao;

import com.pojo.TblEquipment;
import com.pojo.TblEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblEquipmentMapper {
    int countByExample(TblEquipmentExample example);

    int deleteByExample(TblEquipmentExample example);

    int deleteByPrimaryKey(String equipmentid);

    int insert(TblEquipment record);

    int insertSelective(TblEquipment record);

    List<TblEquipment> selectByExample(TblEquipmentExample example);

    TblEquipment selectByPrimaryKey(String equipmentid);

    int updateByExampleSelective(@Param("record") TblEquipment record, @Param("example") TblEquipmentExample example);

    int updateByExample(@Param("record") TblEquipment record, @Param("example") TblEquipmentExample example);

    int updateByPrimaryKeySelective(TblEquipment record);

    int updateByPrimaryKey(TblEquipment record);
}