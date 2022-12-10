package com.srp.server.userManage.service;

import com.srp.server.userManage.model.UserDetail;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户信息
     * @return
     */
    List<UserDetail> getAllUser();

    /**
     * 修改用户信息
     * @param userDetail
     * @return
     */
    Integer updateUser(UserDetail userDetail);

    /**
     * 删除用户
     * @param id
     * @return
     */
    Integer deleteUser(Integer id);

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    UserDetail login(String userName,String password);

    /**
     * 注册用户
     * @param userDetail
     * @return
     */
    UserDetail register(UserDetail userDetail);

    /**
     * 判断用户名是否存在
     * @param userName
     * @return  存在返回true
     */
    Boolean findUserName(String userName);

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    UserDetail findByUserName(String username);
}
