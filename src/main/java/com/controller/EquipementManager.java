package com.controller;

import com.pojo.TblComputer;
import com.service.ComputerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EquipementManager {

    @Resource(name = "ComputerService")
    private ComputerService computerService;

    @RequestMapping("/equipment")
    public ModelAndView computer(){
        ModelAndView mv = new ModelAndView();

        List<TblComputer> allComputer = computerService.getAllComputer();
        mv.addObject("allComputer",allComputer);
        mv.setViewName("ITIL/equipment");

        return mv;
    }

}
