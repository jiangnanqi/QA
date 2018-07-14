package com.dao;

import com.pojo.TblScore;
import com.pojo.TblScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblScoreMapper {
    int countByExample(TblScoreExample example);

    int deleteByExample(TblScoreExample example);

    int deleteByPrimaryKey(String scoreid);

    int insert(TblScore record);

    int insertSelective(TblScore record);

    List<TblScore> selectByExample(TblScoreExample example);

    TblScore selectByPrimaryKey(String scoreid);

    int updateByExampleSelective(@Param("record") TblScore record, @Param("example") TblScoreExample example);

    int updateByExample(@Param("record") TblScore record, @Param("example") TblScoreExample example);

    int updateByPrimaryKeySelective(TblScore record);

    int updateByPrimaryKey(TblScore record);
}