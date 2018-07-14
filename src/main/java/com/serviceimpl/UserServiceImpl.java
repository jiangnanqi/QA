package com.serviceimpl;

import com.dao.TblUserMapper;
import com.pojo.TblUser;
import com.pojo.TblUserExample;
import com.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Service("userService")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
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
