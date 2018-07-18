package com.serviceimpl;

import com.dao.TblPermissionMapper;
import com.pojo.TblPermission;
import com.service.PermissionService;
import com.view.PermissionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private TblPermissionMapper permissionMapper;

    @Override
    public List<PermissionView> getPermissionList() {
        List<PermissionView> permissionViewList = new ArrayList<>();

        List<TblPermission> permissionList = permissionMapper.selectByExample(null);

        for (TblPermission tblPermission : permissionList) {
            PermissionView p = new PermissionView();
            p.setPermissionId(tblPermission.getPermissionid());
            p.setPermissionLogicName(tblPermission.getPermissionlogicname());
            p.setPermissionPhysicalName(tblPermission.getPermissionphysicalname());
            p.setTime(tblPermission.getTime());
            permissionViewList.add(p);
        }
        return permissionViewList;
    }

    @Override
    public int updatePermissionByExample(TblPermission permission) {
        int i = permissionMapper.updateByPrimaryKey(permission);
        return i;
    }

    @Override
    public int deletePermissionById(String permissionid) {
        int i = permissionMapper.deleteByPrimaryKey(permissionid.trim());
        return i;
    }

    @Override
    public int addPermission(TblPermission permission) {
        int count = permissionMapper.insert(permission);
        return count;
    }


}
