package com.dao;

import com.pojo.TblIt;
import com.pojo.TblItExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblItMapper {
    int countByExample(TblItExample example);

    int deleteByExample(TblItExample example);

    int deleteByPrimaryKey(String userid);

    int insert(TblIt record);

    int insertSelective(TblIt record);

    List<TblIt> selectByExample(TblItExample example);

    TblIt selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") TblIt record, @Param("example") TblItExample example);

    int updateByExample(@Param("record") TblIt record, @Param("example") TblItExample example);

    int updateByPrimaryKeySelective(TblIt record);

    int updateByPrimaryKey(TblIt record);
}