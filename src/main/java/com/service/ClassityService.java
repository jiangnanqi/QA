package com.service;

import com.pojo.TblFaqclassify;

import java.util.List;

public interface ClassityService {
    List<TblFaqclassify> getAllClassify();

    List<TblFaqclassify> getSecondClassity(String topid);
}
