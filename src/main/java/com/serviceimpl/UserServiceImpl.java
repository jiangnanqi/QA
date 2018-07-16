package com.serviceimpl;

import com.dao.TblUserMapper;
import com.pojo.TblUser;
import com.pojo.TblUserExample;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private TblUserMapper userDao;

    @Override
    public List<TblUser> findAllUser() {
        return userDao.selectByExample(null);
    }

    @Override
    public List<TblUser> findUser(TblUserExample userExample) {
        List<TblUser> tblUsers = userDao.selectByExample(userExample);
        return tblUsers;
    }


}
