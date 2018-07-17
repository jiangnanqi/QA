package com.serviceimpl;

import com.dao.TblRoleMapper;
import com.pojo.TblRole;
import com.pojo.TblRoleExample;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private TblRoleMapper roleMapper;

    @Override
    public List<TblRole> getidByName(String rolenameOfPublic) {


        TblRoleExample role = new TblRoleExample();

        role.createCriteria().andRolenameEqualTo(rolenameOfPublic.trim());

        List<TblRole> roleslist = roleMapper.selectByExample(role);
        return roleslist;
    }
}
