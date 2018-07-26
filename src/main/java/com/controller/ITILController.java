package com.controller;

import com.service.EventService;
import com.service.FaqService;
import com.service.ProblenService;
import com.view.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ITILController {

    @Resource(name = "EventService")
    private EventService eventService;

    @Resource(name = "ProblemService")
    private ProblenService problenService;

    @Resource(name = "FaqService")
    private FaqService faqService;

    @RequestMapping("/eventManager")
    public ModelAndView event(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();

        //事件
        List<EventView> eventUnresolved = eventService.getEventbySatificationAndStat(0, 0);
        List<EventView> eventresolved = eventService.getEventbySatificationAndStat(1, 0);

        mv.addObject("eventUnresolved",eventUnresolved);
        mv.addObject("eventresolved",eventresolved);
        mv.setViewName("ITIL/eventmanager");

        return mv;
    }

    @RequestMapping("/unresolveEventInfo")
    public ModelAndView unresolveEventInfo(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String userQuestionId = request.getParameter("id");
        EventView eventView = eventService.getUserQuestionDetailById(userQuestionId);
        mv.addObject("eventView",eventView);
        mv.setViewName("ITIL/unresolveevent");
        return mv;
    }

    @RequestMapping("/ignoreevent")
    public void ignoreevent(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        int count = eventService.updateUserProblem(id);
        if(count!=0){
            try {
                response.getWriter().print(count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else{
            System.out.println("error");
        }
    }

    @RequestMapping("/resolveevent")
    public ModelAndView resolveevent(HttpServletRequest request){
        String id = request.getParameter("id");
        ModelAndView mv = new ModelAndView();

        Event_AnswerView event_answerView = eventService.getEventDetailById(id);

        mv.addObject("event_answerView",event_answerView);
        mv.setViewName("ITIL/resolveevent");

        return mv;
    }



    @RequestMapping("/problemManager")
    public ModelAndView problem(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();

        //事件FaqView.java
        List<ProblemView> problemUnresolved = problenService.getEventbyIsanswerAndquestionStat(0, 0);
        List<Problem_AnswerView> problemresolved = problenService.getEventbyIsanswerAndquestionStatbyAnswer();

        mv.addObject("problemUnresolved",problemUnresolved);


        mv.addObject("problemresolved",problemresolved);
        mv.setViewName("ITIL/problemmanager");

        return mv;
    }

    @RequestMapping("/ignoreproblem")
    public void ignoreproblem(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        int count = problenService.updateCommunityProblem(id);
        if(count!=0){
            try {
                response.getWriter().print(count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("error");
        }
    }

    @RequestMapping("/probleminfo")
    public ModelAndView infoProblemDetail(HttpServletRequest request, HttpServletResponse response){
        String communityQuestionId = request.getParameter("id");

        ModelAndView mv = new ModelAndView();

        Problem_AnswerView problem_answerView =  problenService.getDetailForProblem(communityQuestionId);

        mv.addObject("problem_answerView",problem_answerView);
        mv.setViewName("ITIL/resolveproblem");
        return mv;
    }

    @RequestMapping("/unresolveprobleminfo")
    public ModelAndView unresolveprobleminfo(HttpServletRequest request, HttpServletResponse response){
        String communityQuestionId = request.getParameter("id");

        ModelAndView mv = new ModelAndView();

        ProblemView problemView =  problenService.getDetailForUnresolveProblem(communityQuestionId);

        mv.addObject("problemView",problemView);
        mv.setViewName("ITIL/unresolveproblem");
        return mv;
    }


    @RequestMapping("/FAQmanager")
    public ModelAndView findAllFaq(){
        ModelAndView mv = new ModelAndView();

        List<FaqViewUnDeal> faqListUnDeal = faqService.getFaqListUnDeal();


        mv.addObject("faqListUnDeal",faqListUnDeal);
        mv.setViewName("ITIL/FAQmanager");
        return mv;
    }

    @RequestMapping("/getFaqList")
    public @ResponseBody List getFaqList(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        List<FaqView> list = new ArrayList<>();
        List<FaqView> faqList = faqService.getFaqList(id);
        return faqList;
    }

    @RequestMapping("/deleteFaqById")
    public void deleteFaqById(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        int count = faqService.deleteFaqById(id);
        try {
            response.getWriter().print(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/showInfoFaq")
    public @ResponseBody Faq_AnswerView showInfoFaq(HttpServletRequest request){
        String questionid = request.getParameter("id");
        Faq_AnswerView faq_answerView = faqService.getFaqDetailByID(questionid);
        return faq_answerView;
    }

    @RequestMapping("/updateFaqState")
    public void updateFaqState(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        int count = faqService.updateFaqState(id);
        try {
            response.getWriter().print(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
