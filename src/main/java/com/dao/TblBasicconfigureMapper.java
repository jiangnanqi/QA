package com.dao;

import com.pojo.TblBasicconfigure;
import com.pojo.TblBasicconfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblBasicconfigureMapper {
    int countByExample(TblBasicconfigureExample example);

    int deleteByExample(TblBasicconfigureExample example);

    int deleteByPrimaryKey(String basicconfigure);

    int insert(TblBasicconfigure record);

    int insertSelective(TblBasicconfigure record);

    List<TblBasicconfigure> selectByExample(TblBasicconfigureExample example);

    TblBasicconfigure selectByPrimaryKey(String basicconfigure);

    int updateByExampleSelective(@Param("record") TblBasicconfigure record, @Param("example") TblBasicconfigureExample example);

    int updateByExample(@Param("record") TblBasicconfigure record, @Param("example") TblBasicconfigureExample example);

    int updateByPrimaryKeySelective(TblBasicconfigure record);

    int updateByPrimaryKey(TblBasicconfigure record);
}