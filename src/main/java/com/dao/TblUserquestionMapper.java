package com.dao;

import com.pojo.TblUserquestion;
import com.pojo.TblUserquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserquestionMapper {
    int countByExample(TblUserquestionExample example);

    int deleteByExample(TblUserquestionExample example);

    int deleteByPrimaryKey(String userquestionid);

    int insert(TblUserquestion record);

    int insertSelective(TblUserquestion record);

    List<TblUserquestion> selectByExample(TblUserquestionExample example);

    TblUserquestion selectByPrimaryKey(String userquestionid);

    int updateByExampleSelective(@Param("record") TblUserquestion record, @Param("example") TblUserquestionExample example);

    int updateByExample(@Param("record") TblUserquestion record, @Param("example") TblUserquestionExample example);

    int updateByPrimaryKeySelective(TblUserquestion record);

    int updateByPrimaryKey(TblUserquestion record);
}