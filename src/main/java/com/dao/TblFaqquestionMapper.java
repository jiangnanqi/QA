package com.dao;

import com.pojo.TblFaqquestion;
import com.pojo.TblFaqquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFaqquestionMapper {
    int countByExample(TblFaqquestionExample example);

    int deleteByExample(TblFaqquestionExample example);

    int deleteByPrimaryKey(String faqquestionid);

    int insert(TblFaqquestion record);

    int insertSelective(TblFaqquestion record);

    List<TblFaqquestion> selectByExampleWithBLOBs(TblFaqquestionExample example);

    List<TblFaqquestion> selectByExample(TblFaqquestionExample example);

    TblFaqquestion selectByPrimaryKey(String faqquestionid);

    int updateByExampleSelective(@Param("record") TblFaqquestion record, @Param("example") TblFaqquestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TblFaqquestion record, @Param("example") TblFaqquestionExample example);

    int updateByExample(@Param("record") TblFaqquestion record, @Param("example") TblFaqquestionExample example);

    int updateByPrimaryKeySelective(TblFaqquestion record);

    int updateByPrimaryKeyWithBLOBs(TblFaqquestion record);

    int updateByPrimaryKey(TblFaqquestion record);
}