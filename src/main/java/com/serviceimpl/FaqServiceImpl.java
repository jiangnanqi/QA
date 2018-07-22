package com.serviceimpl;

import com.dao.TblFaqclassifyMapper;
import com.dao.TblFaqquestionMapper;
import com.dao.TblUserMapper;
import com.pojo.TblFaqclassify;
import com.pojo.TblFaqclassifyExample;
import com.pojo.TblFaqquestion;
import com.pojo.TblFaqquestionExample;
import com.service.FaqService;
import com.view.FaqView;
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
        int count = faqquestionMapper.deleteByPrimaryKey(id);
        return count;
    }
}
