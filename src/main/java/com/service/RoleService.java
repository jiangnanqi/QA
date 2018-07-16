package com.service;

import com.pojo.TblRole;

import java.util.List;

public interface RoleService {
    List<TblRole> getidByName(String rolenameOfPublic);
}
