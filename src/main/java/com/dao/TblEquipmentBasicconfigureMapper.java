package com.dao;

import com.pojo.TblEquipmentBasicconfigure;
import com.pojo.TblEquipmentBasicconfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblEquipmentBasicconfigureMapper {
    int countByExample(TblEquipmentBasicconfigureExample example);

    int deleteByExample(TblEquipmentBasicconfigureExample example);

    int deleteByPrimaryKey(String equipmentbasicconfigureid);

    int insert(TblEquipmentBasicconfigure record);

    int insertSelective(TblEquipmentBasicconfigure record);

    List<TblEquipmentBasicconfigure> selectByExample(TblEquipmentBasicconfigureExample example);

    TblEquipmentBasicconfigure selectByPrimaryKey(String equipmentbasicconfigureid);

    int updateByExampleSelective(@Param("record") TblEquipmentBasicconfigure record, @Param("example") TblEquipmentBasicconfigureExample example);

    int updateByExample(@Param("record") TblEquipmentBasicconfigure record, @Param("example") TblEquipmentBasicconfigureExample example);

    int updateByPrimaryKeySelective(TblEquipmentBasicconfigure record);

    int updateByPrimaryKey(TblEquipmentBasicconfigure record);
}