package com.serviceimpl;

import com.dao.TblLogMapper;
import com.dao.TblUserMapper;
import com.pojo.TblLog;
import com.service.LogService;
import com.view.logindexView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("logService")
public class LogServiceImpl implements LogService {

    @Autowired
    private TblLogMapper logDao;

    @Autowired
    private TblUserMapper userMapper;

    @Override
    public List<logindexView> findalllog() {
        List<logindexView> logview = new ArrayList<>();
        List<TblLog> loglist = logDao.selectByExample(null);
        for (TblLog tblLog : loglist) {
            logindexView l = new logindexView();
            l.setLogId(tblLog.getLogid());
            l.setLogMethod(tblLog.getLogmethod());
            l.setLogTime(tblLog.getLogtime());
            l.setLogUersId(tblLog.getUserid());
            l.setLogUser(userMapper.selectByPrimaryKey(tblLog.getUserid()).getUsername().trim());
            logview.add(l);
        }
        return logview;
    }

    @Override
    public void deleteLogById(String id) {
        logDao.deleteByPrimaryKey(id);
    }
}
