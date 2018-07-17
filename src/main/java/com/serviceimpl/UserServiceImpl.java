package com.serviceimpl;

import com.dao.TblRoleMapper;
import com.dao.TblUserMapper;
import com.pojo.TblUser;
import com.pojo.TblUserExample;
import com.service.UserService;
import com.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private TblUserMapper userDao;

    @Autowired
    private TblRoleMapper roleMapper;

    @Override
    public List<TblUser> findAllUser() {
        return userDao.selectByExample(null);
    }


    /**
     * 根据条件获取用户
     * @param userExample
     * @return
     */
    @Override
    public List<TblUser> findUser(TblUserExample userExample) {
        List<TblUser> tblUsers = userDao.selectByExample(userExample);
        return tblUsers;
    }


    /**
     * 获取待审核的用户
     * @param state
     * @return
     */
    @Override
    public List<UserView> getAllPendingAuditUsers(int state) {
        TblUserExample userExample = new TblUserExample();
        userExample.createCriteria().andUserstateEqualTo(state);
        List<TblUser> tblUsers = userDao.selectByExample(userExample);
        List<UserView> pendingAuditUsers = getListView(tblUsers);
        return pendingAuditUsers;

    }

    /**
     * 获取普通用户，it运维 员和管理员
     * @param state
     * @param roleid
     * @return
     */
    public List<UserView> getAllUser(int state, String roleid){
        TblUserExample userExample = new TblUserExample();
        userExample.createCriteria().andUserstateEqualTo(state).andRoleidEqualTo(roleid.trim());
        List<TblUser> tblUsers = userDao.selectByExample(userExample);
        List<UserView> publicUserList = getListView(tblUsers);
        return publicUserList;
    }


    /**
     * 获取
     * @param tblUsers
     * @return
     */
    public List<UserView> getListView(List<TblUser> tblUsers){

        List<UserView> views = new ArrayList<>();
        for (TblUser tblUser : tblUsers) {
            UserView userView = new UserView();
            userView.setUSERID(tblUser.getUserid());
            userView.setUSERNAME(tblUser.getUsername());
            userView.setUSEREMAIL(tblUser.getUseremail());
            userView.setGENDER(tblUser.getGender());
            userView.setUSERBIRTHDAY(tblUser.getUserbirthday());
            userView.setUSERADDRESS(tblUser.getUseraddress());
            userView.setUSERSIGNATURE(tblUser.getUsersignature());
            userView.setCREATETIME(tblUser.getCreatetime());

            userView.setROLEID(tblUser.getRoleid());
            String  roleName = roleMapper.selectByPrimaryKey(tblUser.getRoleid()).getRolename();

            userView.setROLENAME(roleName);

            userView.setAVATAR(tblUser.getAvatar());
            views.add(userView);
        }
        return views;
    }

}
