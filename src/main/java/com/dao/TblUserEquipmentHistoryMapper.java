package com.dao;

import com.pojo.TblUserEquipmentHistory;
import com.pojo.TblUserEquipmentHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserEquipmentHistoryMapper {
    int countByExample(TblUserEquipmentHistoryExample example);

    int deleteByExample(TblUserEquipmentHistoryExample example);

    int deleteByPrimaryKey(String userequipmenthistoryid);

    int insert(TblUserEquipmentHistory record);

    int insertSelective(TblUserEquipmentHistory record);

    List<TblUserEquipmentHistory> selectByExample(TblUserEquipmentHistoryExample example);

    TblUserEquipmentHistory selectByPrimaryKey(String userequipmenthistoryid);

    int updateByExampleSelective(@Param("record") TblUserEquipmentHistory record, @Param("example") TblUserEquipmentHistoryExample example);

    int updateByExample(@Param("record") TblUserEquipmentHistory record, @Param("example") TblUserEquipmentHistoryExample example);

    int updateByPrimaryKeySelective(TblUserEquipmentHistory record);

    int updateByPrimaryKey(TblUserEquipmentHistory record);
}