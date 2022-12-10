package com.srp.server.userManage.controller;

import com.srp.server.config.data.Response;
import com.srp.server.config.data.ResultGenerator;
import com.srp.server.userManage.model.UserDetail;
import com.srp.server.userManage.service.TestMyUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Api(tags = "测试用户")
@RestController
@RequestMapping("/test")
public class TestUserController {

    @Autowired
    private TestMyUserService testMyUserService;

    @ApiOperation(value = "获取所有用户信息",notes = "获取所有用户信息", httpMethod = "GET")
    @GetMapping("/getAllUser")
    public Response<List<UserDetail>> getAllUser(){
        return ResultGenerator.genSuccessResult(testMyUserService.findAll());
    }

    @ApiOperation(value = "根据id查询用户", notes = "根据id查询用户", httpMethod = "GET")
    @DeleteMapping("/getUserById")
    public Response<Integer> getUserById(Integer id){
        return ResultGenerator.genSuccessResult(testMyUserService.findById(id));
    }


}
