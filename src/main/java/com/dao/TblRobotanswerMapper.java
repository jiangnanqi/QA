package com.dao;

import com.pojo.TblRobotanswer;
import com.pojo.TblRobotanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRobotanswerMapper {
    int countByExample(TblRobotanswerExample example);

    int deleteByExample(TblRobotanswerExample example);

    int deleteByPrimaryKey(String robotanswerid);

    int insert(TblRobotanswer record);

    int insertSelective(TblRobotanswer record);

    List<TblRobotanswer> selectByExample(TblRobotanswerExample example);

    TblRobotanswer selectByPrimaryKey(String robotanswerid);

    int updateByExampleSelective(@Param("record") TblRobotanswer record, @Param("example") TblRobotanswerExample example);

    int updateByExample(@Param("record") TblRobotanswer record, @Param("example") TblRobotanswerExample example);

    int updateByPrimaryKeySelective(TblRobotanswer record);

    int updateByPrimaryKey(TblRobotanswer record);
}