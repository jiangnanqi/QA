package com.dao;

import com.pojo.TblPermission;
import com.pojo.TblPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblPermissionMapper {
    int countByExample(TblPermissionExample example);

    int deleteByExample(TblPermissionExample example);

    int deleteByPrimaryKey(String permissionid);

    int insert(TblPermission record);

    int insertSelective(TblPermission record);

    List<TblPermission> selectByExample(TblPermissionExample example);

    TblPermission selectByPrimaryKey(String permissionid);

    int updateByExampleSelective(@Param("record") TblPermission record, @Param("example") TblPermissionExample example);

    int updateByExample(@Param("record") TblPermission record, @Param("example") TblPermissionExample example);

    int updateByPrimaryKeySelective(TblPermission record);

    int updateByPrimaryKey(TblPermission record);
}