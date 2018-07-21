package com.controller;

import com.pojo.TblFaqclassify;
import com.service.ClassityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ClassityManager {

    @Resource(name = "ClassityService")
    private ClassityService classityService;

    @RequestMapping("/classfiy/getclassify")
    public @ResponseBody List getAllClassify(HttpServletResponse response){
        List<TblFaqclassify> allClassify = classityService.getAllClassify();
        System.out.println(allClassify.size());
        return allClassify;
    }
}
