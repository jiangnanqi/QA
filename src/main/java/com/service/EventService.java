package com.service;

import com.view.EventView;
import com.view.Event_AnswerView;

import java.util.List;

public interface EventService {

    List<EventView> getEventbySatificationAndStat(int i, int i1);

    EventView getUserQuestionDetailById(String userQuestionId);

    int updateUserProblem(String id);

    Event_AnswerView getEventDetailById(String id);
}
