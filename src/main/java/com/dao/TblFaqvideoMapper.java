package com.dao;

import com.pojo.TblFaqvideo;
import com.pojo.TblFaqvideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFaqvideoMapper {
    int countByExample(TblFaqvideoExample example);

    int deleteByExample(TblFaqvideoExample example);

    int deleteByPrimaryKey(String faqvideoid);

    int insert(TblFaqvideo record);

    int insertSelective(TblFaqvideo record);

    List<TblFaqvideo> selectByExample(TblFaqvideoExample example);

    TblFaqvideo selectByPrimaryKey(String faqvideoid);

    int updateByExampleSelective(@Param("record") TblFaqvideo record, @Param("example") TblFaqvideoExample example);

    int updateByExample(@Param("record") TblFaqvideo record, @Param("example") TblFaqvideoExample example);

    int updateByPrimaryKeySelective(TblFaqvideo record);

    int updateByPrimaryKey(TblFaqvideo record);
}