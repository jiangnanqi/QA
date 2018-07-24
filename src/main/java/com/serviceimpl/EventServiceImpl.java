package com.serviceimpl;

import com.dao.TblFaqanswerMapper;
import com.dao.TblRobotanswerMapper;
import com.dao.TblUserMapper;
import com.dao.TblUserquestionMapper;
import com.pojo.TblFaqanswer;
import com.pojo.TblRobotanswer;
import com.pojo.TblRobotanswerExample;
import com.pojo.TblUserquestion;
import com.service.EventService;
import com.view.EventView;
import com.view.Event_AnswerView;
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
    @Autowired
    private TblFaqanswerMapper faqanswerMapper;


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

    @Override
    public EventView getUserQuestionDetailById(String userQuestionId) {
        EventView eventView = new EventView();
        TblUserquestion userquestion = userquestionMapper.selectByPrimaryKey(userQuestionId);

        eventView.setUserQuestionId(userquestion.getUserquestionid());
        eventView.setUserQuestionTitle(userquestion.getQuestiontitle());
        eventView.setUserQuestionTime(userquestion.getQuestiontime());
        eventView.setUserName(userMapper.selectByPrimaryKey(userquestion.getUserid()).getUsername());
        return eventView;
    }

    @Override
    public int updateUserProblem(String id) {
        TblRobotanswerExample robotanswerExample = new TblRobotanswerExample();
        robotanswerExample.createCriteria().andUserquestionidEqualTo(id);
        List<TblRobotanswer> robotanswerList = robotanswerMapper.selectByExample(robotanswerExample);
        int count = 0;
        for (TblRobotanswer robotanswer : robotanswerList) {
            robotanswer.setQuestionstate(2);
            count = robotanswerMapper.updateByPrimaryKey(robotanswer);
        }
        return count;
    }

    @Override
    public Event_AnswerView getEventDetailById(String id) {
        Event_AnswerView event_answerView = new Event_AnswerView();

        TblUserquestion userquestion = userquestionMapper.selectByPrimaryKey(id);
        event_answerView.setUSERQUESTIONID(userquestion.getUserquestionid());
        event_answerView.setQUESTIONTIME(userquestion.getQuestiontime());
        event_answerView.setQUESTIONTITLE(userquestion.getQuestiontitle());
        event_answerView.setISFAQ(Integer.toString(userquestion.getIsfaq()));
        event_answerView.setUSERNAME(userMapper.selectByPrimaryKey(userquestion.getUserid()).getUsername());
        event_answerView.setUSERID(userquestion.getUserid());

        TblRobotanswerExample robotanswerExample = new TblRobotanswerExample();
        robotanswerExample.createCriteria().andUserquestionidEqualTo(id);
        List<TblRobotanswer> robotanswers = robotanswerMapper.selectByExample(robotanswerExample);
        for (TblRobotanswer robotanswer : robotanswers) {
            String faqanswerid = robotanswer.getFaqanswerid();
            TblFaqanswer tblFaqanswer = faqanswerMapper.selectByPrimaryKey(faqanswerid);
            event_answerView.setFAQANSWERID(faqanswerid);
            event_answerView.setFAQANSWER(tblFaqanswer.getFaqcontent());
        }
        return event_answerView;
    }


}
