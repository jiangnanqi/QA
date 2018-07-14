package com.dao;

import com.pojo.TblFaqanswer;
import com.pojo.TblFaqanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFaqanswerMapper {
    int countByExample(TblFaqanswerExample example);

    int deleteByExample(TblFaqanswerExample example);

    int deleteByPrimaryKey(String faqanswerid);

    int insert(TblFaqanswer record);

    int insertSelective(TblFaqanswer record);

    List<TblFaqanswer> selectByExampleWithBLOBs(TblFaqanswerExample example);

    List<TblFaqanswer> selectByExample(TblFaqanswerExample example);

    TblFaqanswer selectByPrimaryKey(String faqanswerid);

    int updateByExampleSelective(@Param("record") TblFaqanswer record, @Param("example") TblFaqanswerExample example);

    int updateByExampleWithBLOBs(@Param("record") TblFaqanswer record, @Param("example") TblFaqanswerExample example);

    int updateByExample(@Param("record") TblFaqanswer record, @Param("example") TblFaqanswerExample example);

    int updateByPrimaryKeySelective(TblFaqanswer record);

    int updateByPrimaryKeyWithBLOBs(TblFaqanswer record);

    int updateByPrimaryKey(TblFaqanswer record);
}