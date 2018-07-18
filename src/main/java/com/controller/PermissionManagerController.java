package com.controller;

import com.pojo.TblPermission;
import com.service.PermissionService;
import com.utils.CreateTime;
import com.view.PermissionView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class PermissionManagerController {

    @Resource(name = "permissionService")
    private PermissionService permissionService;

    @RequestMapping("/permissionlist")
    public ModelAndView permissionList() {
        ModelAndView mv = new ModelAndView();

        List<PermissionView> permissionList = permissionService.getPermissionList();

        mv.addObject("permissionList", permissionList);

        mv.setViewName("permission/permissionlist");

        return mv;
    }

    @RequestMapping("/permission/updatepermission")
    public void updatePermissionById(HttpServletRequest request, HttpServletResponse response) {
        String permissionId = request.getParameter("permissionId");
        String logicName = request.getParameter("logicName");
        String physicalName = request.getParameter("physicalName");

        String dateString = CreateTime.createTime();
        System.out.println(dateString);

        TblPermission permission = new TblPermission();
        permission.setPermissionid(permissionId);
        permission.setPermissionlogicname(logicName);
        permission.setPermissionphysicalname(physicalName);
        permission.setTime(dateString);

        int count = permissionService.updatePermissionByExample(permission);
        System.out.println(count);
        try {
            if (count != 0) {
                response.getWriter().print("success");
            } else {
                response.getWriter().print("false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/permission/deletePermission")
    public void deletePermissionById(HttpServletRequest request,HttpServletResponse response){
        String permissionid = request.getParameter("permissionid");
        int count = permissionService.deletePermissionById(permissionid);
        System.out.println(count);
        try {
            if (count != 0) {
                response.getWriter().print("success!");
            } else {
                response.getWriter().print("false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/permission/addpermission")
    public void addPermission(HttpServletRequest request,HttpServletResponse response){
        String logicName = request.getParameter("logicName");
        String physicalName = request.getParameter("physicalName");

        String id = UUID.randomUUID().toString();
        String time = CreateTime.createTime();

        TblPermission permission = new TblPermission();
        permission.setPermissionid(id);
        permission.setPermissionlogicname(logicName);
        permission.setPermissionphysicalname(physicalName);
        permission.setTime(time);

        int count = permissionService.addPermission(permission);
        try {
            if (count != 0) {
                response.getWriter().print("success!");
            } else {
                response.getWriter().print("false!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
