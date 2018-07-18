package com.service;

import com.view.ProblemView;
import com.view.Problem_AnswerView;

import java.util.List;

public interface ProblenService {
    List<ProblemView> getEventbyIsanswerAndquestionStat(int i, int i1);
    List<Problem_AnswerView> getEventbyIsanswerAndquestionStatbyAnswer();
}
