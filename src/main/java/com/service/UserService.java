package com.service;

import com.pojo.TblUser;
import com.pojo.TblUserExample;
import com.view.UserView;

import java.util.List;

public interface UserService {
    List<TblUser> findAllUser();

    List<TblUser> findUser(TblUserExample userExample);

    List<UserView> getAllPendingAuditUsers(int state);

    List<UserView> getAllUser(int i, String roleid);
}
