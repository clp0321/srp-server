package com.srp.server.userManage.service.impl;

import com.srp.server.userManage.dao.UserDetailMapper;
import com.srp.server.userManage.model.UserDetail;
import com.srp.server.userManage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.userManage.dao.UserDetailDynamicSqlSupport.*;
import static com.srp.server.userManage.dao.UserDetailDynamicSqlSupport.userName;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailMapper userDetailMapper ;

    @Override
    public List<UserDetail> getAllUser() {
        return userDetailMapper.selectByExample().build().execute();
    }

    @Override
    public Integer updateUser(UserDetail userDetail) {
        return userDetailMapper.updateByPrimaryKey(userDetail);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserDetail login(String userName_, String password_) {
        List<UserDetail> userDetailList = userDetailMapper.selectByExample()
                .where(userName,isIn(userName_))
                .and(password,isIn(password_))
                .build().execute();
        if (userDetailList.isEmpty()){
            return null;
        }
        return userDetailList.get(0);
    }

    @Override
    public UserDetail register(UserDetail userDetail) {
        userDetailMapper.insert(userDetail);
        return userDetailMapper.selectByPrimaryKey(userDetail.getId());
    }

    /**
     * 判断用户名是否存在
     * @param userName_
     * @return  boolean
     */
    @Override
    public Boolean findUserName(String userName_) {
        List<UserDetail> userDetailList = userDetailMapper.selectByExample()
                .where(userName,isIn(userName_))
                .build().execute();
        if (userDetailList.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    @Override
    public UserDetail findByUserName(String username) {
        List<UserDetail> userDetails = userDetailMapper.selectByExample().where(userName, isIn(username)).build().execute();
        if (userDetails.isEmpty()){
            return null;
        }else {
            return userDetails.get(0);
        }
    }
}
