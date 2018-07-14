package com.dao;

import com.pojo.TblRole;
import com.pojo.TblRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleMapper {
    int countByExample(TblRoleExample example);

    int deleteByExample(TblRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(TblRole record);

    int insertSelective(TblRole record);

    List<TblRole> selectByExample(TblRoleExample example);

    TblRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByExample(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByPrimaryKeySelective(TblRole record);

    int updateByPrimaryKey(TblRole record);
}