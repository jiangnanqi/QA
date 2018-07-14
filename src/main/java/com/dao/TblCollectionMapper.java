package com.dao;

import com.pojo.TblCollection;
import com.pojo.TblCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCollectionMapper {
    int countByExample(TblCollectionExample example);

    int deleteByExample(TblCollectionExample example);

    int deleteByPrimaryKey(String collectionid);

    int insert(TblCollection record);

    int insertSelective(TblCollection record);

    List<TblCollection> selectByExample(TblCollectionExample example);

    TblCollection selectByPrimaryKey(String collectionid);

    int updateByExampleSelective(@Param("record") TblCollection record, @Param("example") TblCollectionExample example);

    int updateByExample(@Param("record") TblCollection record, @Param("example") TblCollectionExample example);

    int updateByPrimaryKeySelective(TblCollection record);

    int updateByPrimaryKey(TblCollection record);
}