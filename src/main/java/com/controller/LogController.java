package com.controller;

import com.service.LogService;
import com.view.logindexView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class LogController {

    @Resource(name = "logService")
    private LogService logService;

   @RequestMapping(value = "/log")
    public ModelAndView logSelectall(){
        ModelAndView mv = new ModelAndView();
        List<logindexView> loglist = logService.findalllog();
        mv.addObject("loglist",loglist);

        mv.setViewName("log/log");
        return mv;
    }

    @RequestMapping(value = "/log/deletelog",method = RequestMethod.POST)
    public void deletelogbyid(HttpServletRequest request, HttpServletResponse response){
       String id = request.getParameter("id").trim();
       logService.deleteLogById(id);
        try {
            response.getWriter().print("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
