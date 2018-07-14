package com.dao;

import com.pojo.TblRolePermission;
import com.pojo.TblRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRolePermissionMapper {
    int countByExample(TblRolePermissionExample example);

    int deleteByExample(TblRolePermissionExample example);

    int deleteByPrimaryKey(String rolepermissionid);

    int insert(TblRolePermission record);

    int insertSelective(TblRolePermission record);

    List<TblRolePermission> selectByExample(TblRolePermissionExample example);

    TblRolePermission selectByPrimaryKey(String rolepermissionid);

    int updateByExampleSelective(@Param("record") TblRolePermission record, @Param("example") TblRolePermissionExample example);

    int updateByExample(@Param("record") TblRolePermission record, @Param("example") TblRolePermissionExample example);

    int updateByPrimaryKeySelective(TblRolePermission record);

    int updateByPrimaryKey(TblRolePermission record);
}