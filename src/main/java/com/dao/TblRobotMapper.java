package com.dao;

import com.pojo.TblRobot;
import com.pojo.TblRobotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRobotMapper {
    int countByExample(TblRobotExample example);

    int deleteByExample(TblRobotExample example);

    int deleteByPrimaryKey(String robotid);

    int insert(TblRobot record);

    int insertSelective(TblRobot record);

    List<TblRobot> selectByExample(TblRobotExample example);

    TblRobot selectByPrimaryKey(String robotid);

    int updateByExampleSelective(@Param("record") TblRobot record, @Param("example") TblRobotExample example);

    int updateByExample(@Param("record") TblRobot record, @Param("example") TblRobotExample example);

    int updateByPrimaryKeySelective(TblRobot record);

    int updateByPrimaryKey(TblRobot record);
}