package com.serviceimpl;

import com.dao.TblCommunityanswerMapper;
import com.dao.TblCommunityquestionMapper;
import com.dao.TblFaqclassifyMapper;
import com.dao.TblUserMapper;
import com.pojo.TblCommunityanswer;
import com.pojo.TblCommunityanswerExample;
import com.pojo.TblCommunityquestion;
import com.pojo.TblCommunityquestionExample;
import com.service.ProblenService;
import com.view.ProblemView;
import com.view.Problem_AnswerView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ProblemService")
public class ProblenServiceImpl implements ProblenService{

    @Autowired
    private TblCommunityquestionMapper communityquestionMapper;
    @Autowired
    private TblUserMapper userMapper;
    @Autowired
    private TblFaqclassifyMapper faqclassifyMapper;
    @Autowired
    private TblCommunityanswerMapper communityanswerMapper;


    @Override
    public List<ProblemView> getEventbyIsanswerAndquestionStat(int questionstat, int isanswer) {
        TblCommunityquestionExample communityquestionExample = new TblCommunityquestionExample();
        communityquestionExample.createCriteria().andQuestionstateEqualTo(questionstat).andIsanswerEqualTo(isanswer);

        List<TblCommunityquestion> communityquestions = communityquestionMapper.selectByExample(communityquestionExample);


        List<ProblemView> list = new ArrayList<>();
        for (TblCommunityquestion tblCommunityquestion : communityquestions) {
            ProblemView problemView = new ProblemView();
            problemView.setProblemId(tblCommunityquestion.getCommunityquestionid());
            problemView.setProblemContent(tblCommunityquestion.getContent());
            problemView.setProblemTitle(tblCommunityquestion.getTitle());
            problemView.setProblemTime(tblCommunityquestion.getTime());
            problemView.setProblemClassifyName(faqclassifyMapper.selectByPrimaryKey(tblCommunityquestion.getClassifyid()).getFaqclassifyname());
            problemView.setProblemUserName(userMapper.selectByPrimaryKey(tblCommunityquestion.getUserid()).getUsername());

            list.add(problemView);
        }
        return list;
    }

    @Override
    public List<Problem_AnswerView> getEventbyIsanswerAndquestionStatbyAnswer() {
        TblCommunityquestionExample communityquestionExample = new TblCommunityquestionExample();
        communityquestionExample.createCriteria().andQuestionstateEqualTo(0).andIsanswerEqualTo(1);

        List<TblCommunityquestion> communityquestions = communityquestionMapper.selectByExample(communityquestionExample);


        List<Problem_AnswerView> list = new ArrayList<>();
        for (TblCommunityquestion tblCommunityquestion : communityquestions) {
            Problem_AnswerView problem_answerView = new Problem_AnswerView();

            problem_answerView.setProblemId(tblCommunityquestion.getCommunityquestionid());
            problem_answerView.setProblemContent(tblCommunityquestion.getContent());
            problem_answerView.setProblemTitle(tblCommunityquestion.getTitle());
            problem_answerView.setProblemTime(tblCommunityquestion.getTime());
            problem_answerView.setProblemClassifyId(tblCommunityquestion.getClassifyid());
            problem_answerView.setProblemClassifyName(faqclassifyMapper.selectByPrimaryKey(tblCommunityquestion.getClassifyid()).getFaqclassifyname());
            problem_answerView.setProblemUserName(userMapper.selectByPrimaryKey(tblCommunityquestion.getUserid()).getUsername());
            problem_answerView.setProblemUserId(tblCommunityquestion.getUserid());

            TblCommunityanswerExample communityanswerExample = new TblCommunityanswerExample();
            communityanswerExample.createCriteria().andCommunityquestionidEqualTo(tblCommunityquestion.getCommunityquestionid());
            List<TblCommunityanswer> communityanswers = communityanswerMapper.selectByExample(communityanswerExample);
            for (TblCommunityanswer communityanswer : communityanswers) {
                problem_answerView.setAnswerContent(communityanswer.getContent());
                problem_answerView.setAnswerUserName(userMapper.selectByPrimaryKey(communityanswer.getUserid()).getUsername());
                problem_answerView.setAnswerTime(communityanswer.getTime());
            }

            list.add(problem_answerView);
        }
        return list;
    }

    @Override
    public int updateCommunityProblem(String id) {
        TblCommunityquestion communityquestion = communityquestionMapper.selectByPrimaryKey(id);
        communityquestion.setQuestionstate(2);
        int count = communityquestionMapper.updateByPrimaryKey(communityquestion);
        return count;
    }

    @Override
    public Problem_AnswerView getDetailForProblem(String communityQuestionId) {
        Problem_AnswerView problem_answerView = new Problem_AnswerView();

        TblCommunityquestion communityquestion = communityquestionMapper.selectByPrimaryKey(communityQuestionId);

        problem_answerView.setProblemId(communityquestion.getCommunityquestionid());
        problem_answerView.setProblemTitle(communityquestion.getTitle());
        problem_answerView.setProblemContent(communityquestion.getContent());
        problem_answerView.setProblemClassifyId(communityquestion.getClassifyid());
        problem_answerView.setProblemClassifyName(faqclassifyMapper.selectByPrimaryKey(communityquestion.getClassifyid()).getFaqclassifyname());
        problem_answerView.setProblemUserId(communityquestion.getUserid());
        problem_answerView.setProblemUserName(userMapper.selectByPrimaryKey(communityquestion.getUserid()).getUsername());
        problem_answerView.setProblemTime(communityquestion.getTime());

        TblCommunityanswerExample communityanswerExample = new TblCommunityanswerExample();
        communityanswerExample.createCriteria().andCommunityquestionidEqualTo(communityQuestionId).andIsbestanswerEqualTo(1);
        List<TblCommunityanswer> communityanswers = communityanswerMapper.selectByExampleWithBLOBs(communityanswerExample);
        for (TblCommunityanswer communityanswer : communityanswers) {
            problem_answerView.setAnswerUserId(communityanswer.getUserid());
            problem_answerView.setAnswerUserName(userMapper.selectByPrimaryKey(communityanswer.getUserid()).getUsername());
            problem_answerView.setAnswerTime(communityanswer.getTime());
            problem_answerView.setAnswerContent(communityanswer.getContent());
        }

        return problem_answerView;

    }

    @Override
    public ProblemView getDetailForUnresolveProblem(String communityQuestionId) {
        ProblemView problemView = new ProblemView();
        TblCommunityquestion communityquestion = communityquestionMapper.selectByPrimaryKey(communityQuestionId);

        problemView.setProblemId(communityquestion.getCommunityquestionid());
        problemView.setProblemTitle(communityquestion.getTitle());
        problemView.setProblemContent(communityquestion.getContent());
        problemView.setProblemClassifyName(faqclassifyMapper.selectByPrimaryKey(communityquestion.getClassifyid()).getFaqclassifyname());
        problemView.setProblemUserName(userMapper.selectByPrimaryKey(communityquestion.getUserid()).getUsername());
        problemView.setProblemTime(communityquestion.getTime());

        return problemView;
    }
}
