package com.service;

import com.pojo.TblUser;
import com.pojo.TblUserExample;

import java.util.List;

public interface UserService {
    List<TblUser> findAllUser();

    List<TblUser> findUser(TblUserExample userExample);
}
