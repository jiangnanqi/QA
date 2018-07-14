package com.dao;

import com.pojo.TblServer;
import com.pojo.TblServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblServerMapper {
    int countByExample(TblServerExample example);

    int deleteByExample(TblServerExample example);

    int deleteByPrimaryKey(String equipmentid);

    int insert(TblServer record);

    int insertSelective(TblServer record);

    List<TblServer> selectByExample(TblServerExample example);

    TblServer selectByPrimaryKey(String equipmentid);

    int updateByExampleSelective(@Param("record") TblServer record, @Param("example") TblServerExample example);

    int updateByExample(@Param("record") TblServer record, @Param("example") TblServerExample example);

    int updateByPrimaryKeySelective(TblServer record);

    int updateByPrimaryKey(TblServer record);
}