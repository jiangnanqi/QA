package com.controller;

import com.pojo.TblRole;
import com.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RoleController {

    @Resource(name = "roleService")
    private RoleService roleService;

    @RequestMapping("/roleSelectAll")
    public @ResponseBody List roleSelectAll(){
        List<TblRole> roles = roleService.getAllRole();
        return roles;
    }

}
