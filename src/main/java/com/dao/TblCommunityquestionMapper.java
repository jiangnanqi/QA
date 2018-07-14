package com.dao;

import com.pojo.TblCommunityquestion;
import com.pojo.TblCommunityquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCommunityquestionMapper {
    int countByExample(TblCommunityquestionExample example);

    int deleteByExample(TblCommunityquestionExample example);

    int deleteByPrimaryKey(String communityquestionid);

    int insert(TblCommunityquestion record);

    int insertSelective(TblCommunityquestion record);

    List<TblCommunityquestion> selectByExampleWithBLOBs(TblCommunityquestionExample example);

    List<TblCommunityquestion> selectByExample(TblCommunityquestionExample example);

    TblCommunityquestion selectByPrimaryKey(String communityquestionid);

    int updateByExampleSelective(@Param("record") TblCommunityquestion record, @Param("example") TblCommunityquestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TblCommunityquestion record, @Param("example") TblCommunityquestionExample example);

    int updateByExample(@Param("record") TblCommunityquestion record, @Param("example") TblCommunityquestionExample example);

    int updateByPrimaryKeySelective(TblCommunityquestion record);

    int updateByPrimaryKeyWithBLOBs(TblCommunityquestion record);

    int updateByPrimaryKey(TblCommunityquestion record);
}