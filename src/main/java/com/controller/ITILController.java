package com.controller;

import com.service.EventService;
import com.service.ProblenService;
import com.view.EventView;
import com.view.ProblemView;
import com.view.Problem_AnswerView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ITILController {

    @Resource(name = "EventService")
    private EventService eventService;

    @Resource(name = "ProblemService")
    private ProblenService problenService;

    @RequestMapping("/eventManager")
    public ModelAndView event(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();

        //事件
        List<EventView> eventUnresolved = eventService.getEventbySatificationAndStat(0, 0);
        List<EventView> eventresolved = eventService.getEventbySatificationAndStat(0, 1);

        mv.addObject("eventUnresolved",eventUnresolved);
        mv.addObject("eventresolved",eventresolved);
        mv.setViewName("ITIL/eventmanager");

        return mv;
    }

    @RequestMapping("/problemManager")
    public ModelAndView problem(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();

        //事件
        List<ProblemView> problemUnresolved = problenService.getEventbyIsanswerAndquestionStat(0, 0);
        List<Problem_AnswerView> problemresolved = problenService.getEventbyIsanswerAndquestionStatbyAnswer();

        mv.addObject("problemUnresolved",problemUnresolved);


        mv.addObject("problemresolved",problemresolved);
        mv.setViewName("ITIL/problemmanager");

        return mv;
    }




}