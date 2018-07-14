package com.controller;


import com.pojo.TblUser;
import com.pojo.TblUserExample;
import com.service.UserService;
import com.utils.MD5;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class User {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userList(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String tempname = req.getParameter("username").trim();
        String temppassword = req.getParameter("password").trim();

        System.out.println(tempname + "   " + temppassword);
        temppassword = MD5.EncoderByMd5(temppassword);
        System.out.println(temppassword);

        TblUserExample userExample = new TblUserExample();
        userExample.createCriteria().andUsernameEqualTo(tempname).andUserpasswordEqualTo(temppassword);

        List<TblUser> users = userService.findUser(userExample);

        return "index";


    }


}
