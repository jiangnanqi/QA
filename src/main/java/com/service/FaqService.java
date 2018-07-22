package com.service;

import com.view.FaqView;

import java.util.List;

public interface FaqService {
    List<FaqView> getFaqList(String id);

    int deleteFaqById(String id);
}
