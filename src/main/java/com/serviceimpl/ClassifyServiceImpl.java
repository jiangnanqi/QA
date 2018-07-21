package com.serviceimpl;

import com.dao.TblFaqclassifyMapper;
import com.pojo.TblFaqclassify;
import com.pojo.TblFaqclassifyExample;
import com.service.ClassityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClassityService")
public class ClassifyServiceImpl implements ClassityService {

    @Autowired
    private TblFaqclassifyMapper faqclassifyMapper;

    @Override
    public List<TblFaqclassify> getAllClassify() {

        TblFaqclassifyExample example = new TblFaqclassifyExample();
        example.createCriteria().andFaqparentidEqualTo("0");

        List<TblFaqclassify> faqclassifyList = faqclassifyMapper.selectByExample(example);
        return faqclassifyList;
    }
}
