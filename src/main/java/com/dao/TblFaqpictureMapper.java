package com.dao;

import com.pojo.TblFaqpicture;
import com.pojo.TblFaqpictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFaqpictureMapper {
    int countByExample(TblFaqpictureExample example);

    int deleteByExample(TblFaqpictureExample example);

    int deleteByPrimaryKey(String faqpictureid);

    int insert(TblFaqpicture record);

    int insertSelective(TblFaqpicture record);

    List<TblFaqpicture> selectByExample(TblFaqpictureExample example);

    TblFaqpicture selectByPrimaryKey(String faqpictureid);

    int updateByExampleSelective(@Param("record") TblFaqpicture record, @Param("example") TblFaqpictureExample example);

    int updateByExample(@Param("record") TblFaqpicture record, @Param("example") TblFaqpictureExample example);

    int updateByPrimaryKeySelective(TblFaqpicture record);

    int updateByPrimaryKey(TblFaqpicture record);
}