package com.controller;

import com.pojo.TblFaqclassify;
import com.service.ClassityService;
import com.service.EventService;
import com.service.FaqService;
import com.service.ProblenService;
import com.view.EventView;
import com.view.FaqViewUnDeal;
import com.view.ProblemView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class homePage {

    @Resource(name = "EventService")
    private EventService eventService;

    @Resource(name = "ProblemService")
    private ProblenService problenService;

    @Resource(name = "FaqService")
    private FaqService faqService;

    @Resource(name = "ClassityService")
    private ClassityService classityService;

    @RequestMapping("/index")
    public ModelAndView showIndex(){
        ModelAndView mv = new ModelAndView();

        List<EventView> event = eventService.getEventbySatificationAndStat(0, 0);
        List<ProblemView> problemUnresolved = problenService.getEventbyIsanswerAndquestionStat(0, 0);
        List<FaqViewUnDeal> faqListUnDeal = faqService.getFaqListUnDeal();
        int eventcount = event.size();
        int problemcount = problemUnresolved.size();
        int faqcount = faqListUnDeal.size();

        mv.addObject("eventcount",eventcount);
        mv.addObject("problemcount",problemcount);

        mv.addObject("faqcount",faqcount);

        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/faqclassifyall")
    public @ResponseBody Map faqClassifyAll(){
        List<TblFaqclassify> allClassify = classityService.getAllClassify();


        Map<String,Integer> map = new HashMap<>();
        for (TblFaqclassify classify : allClassify) {
            int count = faqService.getFaqListCount(classify.getFaqclassifyid());
            map.put(classify.getFaqclassifyname(),count);
        }
        return map;
    }
}
