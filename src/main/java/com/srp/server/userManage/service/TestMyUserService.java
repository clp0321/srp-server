package com.srp.server.userManage.service;

import com.srp.server.userManage.model.TestUser;

import java.util.List;

public interface TestMyUserService {
    /**
     * 查询所有
     * @return
     */
    List<TestUser> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    TestUser findById(Integer id);
}
