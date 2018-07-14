package com.dao;

import com.pojo.TblCommunityanswer;
import com.pojo.TblCommunityanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCommunityanswerMapper {
    int countByExample(TblCommunityanswerExample example);

    int deleteByExample(TblCommunityanswerExample example);

    int deleteByPrimaryKey(String communityanswerid);

    int insert(TblCommunityanswer record);

    int insertSelective(TblCommunityanswer record);

    List<TblCommunityanswer> selectByExampleWithBLOBs(TblCommunityanswerExample example);

    List<TblCommunityanswer> selectByExample(TblCommunityanswerExample example);

    TblCommunityanswer selectByPrimaryKey(String communityanswerid);

    int updateByExampleSelective(@Param("record") TblCommunityanswer record, @Param("example") TblCommunityanswerExample example);

    int updateByExampleWithBLOBs(@Param("record") TblCommunityanswer record, @Param("example") TblCommunityanswerExample example);

    int updateByExample(@Param("record") TblCommunityanswer record, @Param("example") TblCommunityanswerExample example);

    int updateByPrimaryKeySelective(TblCommunityanswer record);

    int updateByPrimaryKeyWithBLOBs(TblCommunityanswer record);

    int updateByPrimaryKey(TblCommunityanswer record);
}