package com.serviceimpl;

import com.dao.TblRobotanswerMapper;
import com.dao.TblUserMapper;
import com.dao.TblUserquestionMapper;
import com.pojo.TblRobotanswer;
import com.pojo.TblRobotanswerExample;
import com.pojo.TblUserquestion;
import com.service.EventService;
import com.view.EventView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("EventService")
public class EventServiceImpl implements EventService {

    @Autowired
    private TblRobotanswerMapper robotanswerMapper;
    @Autowired
    private TblUserMapper userMapper;
    @Autowired
    private TblUserquestionMapper userquestionMapper;

    public List<EventView> getEventbySatificationAndStat(int i,int j){
        TblRobotanswerExample robotanswerExample = new TblRobotanswerExample();
        robotanswerExample.createCriteria().andSaticfactionEqualTo(i).andQuestionstateEqualTo(j);

        List<TblRobotanswer> robotanswers = robotanswerMapper.selectByExample(robotanswerExample);


        List<EventView> list = new ArrayList<>();

        for (TblRobotanswer robotanswer : robotanswers) {
            EventView eventView = new EventView();
            eventView.setUserQuestionId(robotanswer.getUserquestionid());
            TblUserquestion userquestion = userquestionMapper.selectByPrimaryKey(robotanswer.getUserquestionid());
            eventView.setUserQuestionTime(userquestion.getQuestiontime());
            eventView.setUserQuestionTitle(userquestion.getQuestiontitle());
            eventView.setUserName(userMapper.selectByPrimaryKey(userquestion.getUserid()).getUsername());

            list.add(eventView);
        }

        return list;
    }


}
