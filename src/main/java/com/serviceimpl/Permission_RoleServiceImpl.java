package com.serviceimpl;

import com.dao.TblRolePermissionMapper;
import com.pojo.TblRolePermission;
import com.pojo.TblRolePermissionExample;
import com.service.Permission_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("Permission_RoleService")
public class Permission_RoleServiceImpl implements Permission_RoleService {

    @Autowired
    private TblRolePermissionMapper rolePermissionMapper;

    @Override
    public int updateRelation(String roleid, List<String> permissionList) {
        TblRolePermissionExample example = new TblRolePermissionExample();
        example.createCriteria().andRoleidEqualTo(roleid);
        rolePermissionMapper.deleteByExample(example);
        int i = 0;
        for (String permissionid : permissionList) {
            String uuid = UUID.randomUUID().toString();
            TblRolePermission rolePermission = new TblRolePermission();
            rolePermission.setRolepermissionid(uuid);
            rolePermission.setPermissionid(permissionid);
            rolePermission.setRoleid(roleid);

            rolePermissionMapper.insert(rolePermission);
            i++;
        }
        return i;
    }
}
