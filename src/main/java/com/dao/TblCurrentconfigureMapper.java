package com.dao;

import com.pojo.TblCurrentconfigure;
import com.pojo.TblCurrentconfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCurrentconfigureMapper {
    int countByExample(TblCurrentconfigureExample example);

    int deleteByExample(TblCurrentconfigureExample example);

    int deleteByPrimaryKey(String currentconfigureid);

    int insert(TblCurrentconfigure record);

    int insertSelective(TblCurrentconfigure record);

    List<TblCurrentconfigure> selectByExample(TblCurrentconfigureExample example);

    TblCurrentconfigure selectByPrimaryKey(String currentconfigureid);

    int updateByExampleSelective(@Param("record") TblCurrentconfigure record, @Param("example") TblCurrentconfigureExample example);

    int updateByExample(@Param("record") TblCurrentconfigure record, @Param("example") TblCurrentconfigureExample example);

    int updateByPrimaryKeySelective(TblCurrentconfigure record);

    int updateByPrimaryKey(TblCurrentconfigure record);
}