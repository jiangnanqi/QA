package com.controller;

import com.pojo.TblPermission;
import com.pojo.TblRole;
import com.service.PermissionService;
import com.service.Permission_RoleService;
import com.service.RoleService;
import com.utils.CreateTime;
import com.view.PermissionView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class PermissionManagerController {

    @Resource(name = "permissionService")
    private PermissionService permissionService;

    @Resource(name = "roleService")
    private RoleService roleService;

    @Resource(name = "Permission_RoleService")
    private Permission_RoleService permission_roleService;


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

    @RequestMapping("/permission/permisionmanager")
    public ModelAndView permissionManager(){
        ModelAndView mv = new ModelAndView();
        List<TblRole> allRole = roleService.getAllRole();
        List<PermissionView> permissionList = permissionService.getPermissionList();

        mv.addObject("allRole",allRole);
        mv.addObject("permissionList",permissionList);
        mv.setViewName("permission/permisionmanager");
        return mv;
    }

    @RequestMapping("/resetpermission")
    private void resetPermission(@RequestBody List<String> values,HttpServletResponse response) {
        String roleid = values.get(0);
        List<String> permissionList = new ArrayList<>();
        for(int i = 1;i<values.size();i++){
            permissionList.add(values.get(i));
        }

        int count = permission_roleService.updateRelation(roleid,permissionList);
        try {
            response.getWriter().print(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/getPermissionByRole")
    public @ResponseBody List getPermissionByRole(HttpServletRequest request, HttpServletResponse response) {
        String roleid = request.getParameter("roleid");
        List<PermissionView> selectedlist = permissionService.getPermissionListByRoleId(roleid);

        List<PermissionView> allpermissionList = permissionService.getPermissionList();

        List<PermissionView> unselectedlist = new ArrayList<>();

        List<String> unselectedListString = new ArrayList<>();
        List<String> selectedListString = new ArrayList<>();

        for (PermissionView all : allpermissionList) {
            unselectedListString.add(all.getPermissionId());
        }
        for (PermissionView selected : selectedlist) {
            selectedListString.add(selected.getPermissionId());
        }
        unselectedListString.removeAll(selectedListString);


        for (PermissionView permission : allpermissionList) {
            if (unselectedListString.contains(permission.getPermissionId())) {
                unselectedlist.add(permission);
            }
        }

        List<List<PermissionView>> list = new ArrayList<>();
        list.add(unselectedlist);
        list.add(selectedlist);
        return list;
    }

}
