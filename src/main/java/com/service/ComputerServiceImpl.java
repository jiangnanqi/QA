package com.service;

import com.dao.TblComputerMapper;
import com.pojo.TblComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ComputerService")
public class ComputerServiceImpl implements ComputerService{

    @Autowired
    private TblComputerMapper computerMapper;

    @Override
    public List<TblComputer> getAllComputer() {
        List<TblComputer> computers = computerMapper.selectByExample(null);
        return computers;
    }
}
