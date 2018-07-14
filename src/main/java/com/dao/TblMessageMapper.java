package com.dao;

import com.pojo.TblMessage;
import com.pojo.TblMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblMessageMapper {
    int countByExample(TblMessageExample example);

    int deleteByExample(TblMessageExample example);

    int deleteByPrimaryKey(String messageid);

    int insert(TblMessage record);

    int insertSelective(TblMessage record);

    List<TblMessage> selectByExample(TblMessageExample example);

    TblMessage selectByPrimaryKey(String messageid);

    int updateByExampleSelective(@Param("record") TblMessage record, @Param("example") TblMessageExample example);

    int updateByExample(@Param("record") TblMessage record, @Param("example") TblMessageExample example);

    int updateByPrimaryKeySelective(TblMessage record);

    int updateByPrimaryKey(TblMessage record);
}