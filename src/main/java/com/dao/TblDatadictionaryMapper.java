package com.dao;

import com.pojo.TblDatadictionary;
import com.pojo.TblDatadictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDatadictionaryMapper {
    int countByExample(TblDatadictionaryExample example);

    int deleteByExample(TblDatadictionaryExample example);

    int deleteByPrimaryKey(String datadictionaryid);

    int insert(TblDatadictionary record);

    int insertSelective(TblDatadictionary record);

    List<TblDatadictionary> selectByExample(TblDatadictionaryExample example);

    TblDatadictionary selectByPrimaryKey(String datadictionaryid);

    int updateByExampleSelective(@Param("record") TblDatadictionary record, @Param("example") TblDatadictionaryExample example);

    int updateByExample(@Param("record") TblDatadictionary record, @Param("example") TblDatadictionaryExample example);

    int updateByPrimaryKeySelective(TblDatadictionary record);

    int updateByPrimaryKey(TblDatadictionary record);
}