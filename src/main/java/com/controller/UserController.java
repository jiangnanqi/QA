package com.controller;


import com.pojo.TblRole;
import com.pojo.TblUser;
import com.pojo.TblUserExample;
import com.service.RoleService;
import com.service.UserService;
import com.utils.MD5;
import com.view.UserView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name = "roleService")
    private RoleService roleService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userList(HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String tempname = req.getParameter("username").trim();
        String temppassword = req.getParameter("password").trim();

        System.out.println(tempname + "   " + temppassword);
        temppassword = MD5.EncoderByMd5(temppassword);
        System.out.println(temppassword);

        TblUserExample userExample = new TblUserExample();
        userExample.createCriteria().andUsernameEqualTo(tempname).andUserpasswordEqualTo(temppassword);

        List<TblUser> users = userService.findUser(userExample);

        if(users.size()==0){
            return "redirect:login.html";
        }else{
            TblUser user = users.get(0);
//            System.out.println(user);
            session.setAttribute("loginuser",user);
            return "redirect:/user";
        }


    }


    @RequestMapping("/user")
    public ModelAndView getAllUser(){
        ModelAndView mv = new ModelAndView();

        //pendingauditUser
        List<UserView> pendingAuditUser = userService.getAllPendingAuditUsers(1);


        String rolenameOfPublic = "普通用户";
        List<TblRole> rolesList = roleService.getidByName(rolenameOfPublic);
        List<UserView> publicUser = userService.getAllUser(2,rolesList.get(0).getRoleid());


        String rolenameOfIT = "运维人员";
        List<TblRole> rolesListIT = roleService.getidByName(rolenameOfIT);
        List<UserView> ITUser = userService.getAllUser(2,rolesListIT.get(0).getRoleid());

        String rolenameOfAdmin = "管理员";
        List<TblRole> rolesListAdmin = roleService.getidByName(rolenameOfAdmin);
        List<UserView> adminUser = userService.getAllUser(2,rolesListAdmin.get(0).getRoleid());

        mv.addObject("pendingAuditUser",pendingAuditUser);
        mv.addObject("publicUser",publicUser);
        mv.addObject("ITUser",ITUser);
        mv.addObject("adminUser",adminUser);
        mv.setViewName("user/user");
        return mv;

    }

    @RequestMapping("/updateUserRole")
    public void updateUserRole(HttpServletRequest request, HttpServletResponse response){
        String userid = request.getParameter("userid");
        String roleid = request.getParameter("roleid");
        int count = userService.updateRoleidByUserId(userid, roleid);
        try {
            response.getWriter().print(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/resetPassword")
    public void resetPassword(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        String password =null;
        try {
            password = MD5.EncoderByMd5("111111");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        int count = userService.updatePassword(id, password);
        try {
            response.getWriter().print(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
