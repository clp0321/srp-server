package com.srp.server.userManage.service.impl;

import com.srp.server.userManage.dao.TestUserMapper;
import com.srp.server.userManage.model.TestUser;
import com.srp.server.userManage.service.TestMyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestMyUserServiceImpl implements TestMyUserService {
    @Autowired
    private TestUserMapper testUserMapper;


    @Override
    public List<TestUser> findAll() {
        return testUserMapper.selectByExample().build().execute();
    }

    @Override
    public TestUser findById(Integer id) {
        return testUserMapper.selectByPrimaryKey(id);
    }
}
