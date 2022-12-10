package com.srp.server.testUserService;

import com.srp.server.SrpApplication;
import com.srp.server.userManage.model.TestUser;
import com.srp.server.userManage.service.TestMyUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
public class TestUserService {
    @Autowired
    private TestMyUserService testMyUserService;

    @Test
    public void testfindAll(){
        List<TestUser> users = testMyUserService.findAll();
        for (TestUser user : users) {
            System.out.println(user);
        }
    }

}
