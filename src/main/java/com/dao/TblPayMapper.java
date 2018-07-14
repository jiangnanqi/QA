package com.dao;

import com.pojo.TblPay;
import com.pojo.TblPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblPayMapper {
    int countByExample(TblPayExample example);

    int deleteByExample(TblPayExample example);

    int deleteByPrimaryKey(String payid);

    int insert(TblPay record);

    int insertSelective(TblPay record);

    List<TblPay> selectByExample(TblPayExample example);

    TblPay selectByPrimaryKey(String payid);

    int updateByExampleSelective(@Param("record") TblPay record, @Param("example") TblPayExample example);

    int updateByExample(@Param("record") TblPay record, @Param("example") TblPayExample example);

    int updateByPrimaryKeySelective(TblPay record);

    int updateByPrimaryKey(TblPay record);
}