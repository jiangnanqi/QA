package com.service;

import com.pojo.TblPermission;
import com.view.PermissionView;

import java.util.List;

public interface PermissionService {

    List<PermissionView> getPermissionList();

    int updatePermissionByExample(TblPermission permission);

    int deletePermissionById(String permissionid);

    int addPermission(TblPermission permission);

    List<PermissionView> getPermissionListByRoleId(String roleid);
}
