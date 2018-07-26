package com.serviceimpl;

import com.dao.TblFaqanswerMapper;
import com.dao.TblFaqclassifyMapper;
import com.dao.TblFaqquestionMapper;
import com.dao.TblUserMapper;
import com.pojo.*;
import com.service.FaqService;
import com.view.FaqView;
import com.view.FaqViewUnDeal;
import com.view.Faq_AnswerView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("FaqService")
public class FaqServiceImpl implements FaqService {

    @Autowired
    private TblFaqquestionMapper faqquestionMapper;

    @Autowired
    private TblUserMapper userMapper;

    @Autowired
    private TblFaqclassifyMapper faqclassifyMapper;

    @Autowired
    private TblFaqanswerMapper faqanswerMapper;

    @Override
    public List<FaqView> getFaqList(String id) {

        TblFaqclassifyExample faqclassifyExample = new TblFaqclassifyExample();
        faqclassifyExample.createCriteria().andFaqparentidEqualTo(id);
        List<TblFaqclassify> faqclassifies = faqclassifyMapper.selectByExample(faqclassifyExample);

        List<FaqView> list = new ArrayList<>();


        for (TblFaqclassify faqclassify : faqclassifies) {
            TblFaqquestionExample example = new TblFaqquestionExample();
            example.createCriteria().andFaqclassifyidEqualTo(faqclassify.getFaqclassifyid());

            List<TblFaqquestion> faqquestions = faqquestionMapper.selectByExample(example);

            for (TblFaqquestion faqquestion : faqquestions) {
                FaqView faqView = new FaqView();
                faqView.setFAQQUESTIONID(faqquestion.getFaqquestionid());
                faqView.setFAQTITLE(faqquestion.getFaqtitle());
                faqView.setFAQKEYWORDS(faqquestion.getFaqkeywords());
                faqView.setFAQCLASSIFYID(id);
                faqView.setCOLLECTION(faqquestion.getCollection());
                faqView.setSCAN(faqquestion.getScan());
                faqView.setMODIFYTIME(faqquestion.getModifytime());
                faqView.setMODIFYNUMBER(faqquestion.getModifynumber());
                faqView.setFAQDESCRIPTION(faqquestion.getFaqdescription());
                faqView.setFAQSTATE(faqquestion.getFaqstate());
                faqView.setUSERID(faqquestion.getUserid());
                faqView.setUSERNAME(userMapper.selectByPrimaryKey(faqquestion.getUserid()).getUsername());

                list.add(faqView);
            }
        }
        return list;
    }

    @Override
    public int deleteFaqById(String id) {
        TblFaqquestion faqquestion = faqquestionMapper.selectByPrimaryKey(id);

        TblFaqanswerExample robotanswerExample = new TblFaqanswerExample();
        robotanswerExample.createCriteria().andFaqquestionidEqualTo(id);
        List<TblFaqanswer> faqanswers = faqanswerMapper.selectByExample(robotanswerExample);
        for (TblFaqanswer faqanswer : faqanswers) {
            faqanswerMapper.deleteByPrimaryKey(faqanswer.getFaqanswerid());
        }

        int count = faqquestionMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public Faq_AnswerView getFaqDetailByID(String questionid) {
        Faq_AnswerView faq_answerView = new Faq_AnswerView();

        TblFaqquestion faqquestion = faqquestionMapper.selectByPrimaryKey(questionid);
        faq_answerView.setFAQQUESTIONID(questionid);
        faq_answerView.setFAQTITLE(faqquestion.getFaqtitle());

        faq_answerView.setFAQCLASSIFYID(faqquestion.getFaqclassifyid());
        faq_answerView.setFAQCLASSIFYNAME(faqclassifyMapper.selectByPrimaryKey(faqquestion.getFaqclassifyid()).getFaqclassifyname());

        TblFaqanswerExample faqanswerExample = new TblFaqanswerExample();
        faqanswerExample.createCriteria().andFaqquestionidEqualTo(questionid);
        List<TblFaqanswer> faqanswers = faqanswerMapper.selectByExampleWithBLOBs(faqanswerExample);
        for (TblFaqanswer faqanswer : faqanswers) {
            faq_answerView.setFAQANSWERID(faqanswer.getFaqanswerid());
            faq_answerView.setFAQANSWERNAME(faqanswer.getFaqcontent());
        }
        return faq_answerView;
    }

    @Override
    public List<FaqViewUnDeal> getFaqListUnDeal() {
        List<FaqViewUnDeal> list = new ArrayList<>();

        TblFaqquestionExample faqquestionExample = new TblFaqquestionExample();
        faqquestionExample.createCriteria().andFaqstateEqualTo(1);
        List<TblFaqquestion> faqquestions = faqquestionMapper.selectByExampleWithBLOBs(faqquestionExample);
        for (TblFaqquestion faqquestion : faqquestions) {
            FaqViewUnDeal faqViewUnDeal = new FaqViewUnDeal();

            faqViewUnDeal.setFAQTITLE(faqquestion.getFaqtitle());
            faqViewUnDeal.setFAQQUESTIONID(faqquestion.getFaqquestionid());
            faqViewUnDeal.setFAQKEYWORDS(faqquestion.getFaqkeywords());
            faqViewUnDeal.setFAQCLASSIFYID(faqquestion.getFaqclassifyid());
            faqViewUnDeal.setFAQCLASSIFYName(faqclassifyMapper.selectByPrimaryKey(faqquestion.getFaqclassifyid()).getFaqclassifyname());
            faqViewUnDeal.setCOLLECTION(faqquestion.getCollection());
            faqViewUnDeal.setSCAN(faqquestion.getScan());
            faqViewUnDeal.setMODIFYTIME(faqquestion.getModifytime());
            faqViewUnDeal.setFAQDESCRIPTION(faqquestion.getFaqdescription());
            faqViewUnDeal.setMODIFYNUMBER(faqquestion.getModifynumber());
            faqViewUnDeal.setFAQSTATE(1);
            faqViewUnDeal.setUSERID(faqquestion.getUserid());
            faqViewUnDeal.setUSERNAME(userMapper.selectByPrimaryKey(faqquestion.getUserid()).getUsername());

            TblFaqanswerExample faqanswerExample = new TblFaqanswerExample();
            faqanswerExample.createCriteria().andFaqquestionidEqualTo(faqquestion.getFaqquestionid());
            List<TblFaqanswer> tblFaqanswers = faqanswerMapper.selectByExampleWithBLOBs(faqanswerExample);
            for (TblFaqanswer tblFaqanswer : tblFaqanswers) {
                faqViewUnDeal.setFaqAnswer(tblFaqanswer.getFaqcontent());
            }

            list.add(faqViewUnDeal);

        }
        return list;
    }

    @Override
    public int updateFaqState(String id) {
        TblFaqquestion faqquestion = faqquestionMapper.selectByPrimaryKey(id);
        faqquestion.setFaqstate(2);
        int count = faqquestionMapper.updateByPrimaryKey(faqquestion);
        return count;
    }
}
