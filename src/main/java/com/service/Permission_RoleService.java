package com.service;

import java.util.List;

public interface Permission_RoleService {
    int updateRelation(String roleid, List<String> permissionList);
}
