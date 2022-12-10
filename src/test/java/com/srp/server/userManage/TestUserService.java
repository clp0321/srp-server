package com.srp.server.userManage;

import com.srp.server.SrpApplication;
import com.srp.server.userManage.model.TestUser;
import com.srp.server.userManage.model.UserDetail;
import com.srp.server.userManage.service.TestMyUserService;
import com.srp.server.userManage.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@ActiveProfiles("xiang")
@SpringBootTest(classes = SrpApplication.class)
public class TestUserService {
    @Autowired
    private TestMyUserService testMyUserService;

    @Autowired
    private UserService userService;

    @Test
    public void testfindAll(){
        List<TestUser> users = testMyUserService.findAll();
        for (TestUser user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void testfindById(){
        TestUser user = testMyUserService.findById(1);
            System.out.println(user);
    }

    @Test
    public void register(){
        UserDetail detail=new UserDetail();
        detail.setAddress("aaa");
        detail.setAddressName("相");
        detail.setAvatar("aa");
        detail.setPassword("124");
        detail.setPhone("啦啦啦");
        detail.setUserName("xiang");
        detail.setRole(0);
        userService.register(detail);
    }

    /**
     * 测试判断用户名是否存在
     */
    @Test
    public void testfindUserName(){
        Boolean userName = userService.findUserName("lalala");
        System.out.println(userName);
    }

    @Test
    public void testfindByUserName(){
        UserDetail userDetail = userService.findByUserName("xiang");
        System.out.println(userDetail);
    }
}
