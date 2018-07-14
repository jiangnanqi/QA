package com.dao;

import com.pojo.TblCurrentequipment;
import com.pojo.TblCurrentequipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCurrentequipmentMapper {
    int countByExample(TblCurrentequipmentExample example);

    int deleteByExample(TblCurrentequipmentExample example);

    int deleteByPrimaryKey(String equipmentid);

    int insert(TblCurrentequipment record);

    int insertSelective(TblCurrentequipment record);

    List<TblCurrentequipment> selectByExample(TblCurrentequipmentExample example);

    TblCurrentequipment selectByPrimaryKey(String equipmentid);

    int updateByExampleSelective(@Param("record") TblCurrentequipment record, @Param("example") TblCurrentequipmentExample example);

    int updateByExample(@Param("record") TblCurrentequipment record, @Param("example") TblCurrentequipmentExample example);

    int updateByPrimaryKeySelective(TblCurrentequipment record);

    int updateByPrimaryKey(TblCurrentequipment record);
}