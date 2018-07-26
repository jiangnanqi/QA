package com.service;

import com.view.FaqView;
import com.view.FaqViewUnDeal;
import com.view.Faq_AnswerView;

import java.util.List;

public interface FaqService {
    List<FaqView> getFaqList(String id);

    int deleteFaqById(String id);

    Faq_AnswerView getFaqDetailByID(String questionid);

    List<FaqViewUnDeal> getFaqListUnDeal();

    int updateFaqState(String id);

    int getFaqListCount(String faqclassifyid);
}
