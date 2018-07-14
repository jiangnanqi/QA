package com.dao;

import com.pojo.TblComment;
import com.pojo.TblCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCommentMapper {
    int countByExample(TblCommentExample example);

    int deleteByExample(TblCommentExample example);

    int deleteByPrimaryKey(String commentid);

    int insert(TblComment record);

    int insertSelective(TblComment record);

    List<TblComment> selectByExample(TblCommentExample example);

    TblComment selectByPrimaryKey(String commentid);

    int updateByExampleSelective(@Param("record") TblComment record, @Param("example") TblCommentExample example);

    int updateByExample(@Param("record") TblComment record, @Param("example") TblCommentExample example);

    int updateByPrimaryKeySelective(TblComment record);

    int updateByPrimaryKey(TblComment record);
}