package com.controller;

import com.service.PermissionService;
import com.view.PermissionView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PermissionManagerController {

    @Resource(name = "permissionService")
    private PermissionService permissionService;

    @RequestMapping("/permissionlist")
    public ModelAndView permissionList(){
        ModelAndView mv = new ModelAndView();

        List<PermissionView> permissionList = permissionService.getPermissionList();

        mv.addObject("permissionList",permissionList);

        mv.setViewName("permission/permissionlist");

        return mv;
    }
}
