package com.dao;

import com.pojo.TblFaqclassify;
import com.pojo.TblFaqclassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFaqclassifyMapper {
    int countByExample(TblFaqclassifyExample example);

    int deleteByExample(TblFaqclassifyExample example);

    int deleteByPrimaryKey(String faqclassifyid);

    int insert(TblFaqclassify record);

    int insertSelective(TblFaqclassify record);

    List<TblFaqclassify> selectByExample(TblFaqclassifyExample example);

    TblFaqclassify selectByPrimaryKey(String faqclassifyid);

    int updateByExampleSelective(@Param("record") TblFaqclassify record, @Param("example") TblFaqclassifyExample example);

    int updateByExample(@Param("record") TblFaqclassify record, @Param("example") TblFaqclassifyExample example);

    int updateByPrimaryKeySelective(TblFaqclassify record);

    int updateByPrimaryKey(TblFaqclassify record);
}