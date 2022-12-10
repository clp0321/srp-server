package com.srp.server.userManage.controller;

import com.srp.server.config.data.Response;
import com.srp.server.config.data.ResultGenerator;
import com.srp.server.userManage.model.UserDetail;
import com.srp.server.userManage.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@Slf4j
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户信息",notes = "获取所有用户信息", httpMethod = "GET")
    @GetMapping("/users")
    public Response<List<UserDetail>> getAllUser(){
        return ResultGenerator.genSuccessResult(userService.getAllUser());
    }

    @ApiOperation(value = "修改用户信息",notes = "修改用户信息", httpMethod = "PUT")
    @PutMapping("")
    public Response<Integer> updateUser(@RequestBody UserDetail userDetail){
        if (userDetail.getId() == null){
            return ResultGenerator.genFailResult("Id不能为空！");
        }
        return ResultGenerator.genSuccessResult(userService.updateUser(userDetail));
    }
    @ApiOperation(value = "删除用户",notes = "删除用户", httpMethod = "DELETE")
    @DeleteMapping("")
    public Response<Integer> deleteUser(Integer id){
        return ResultGenerator.genSuccessResult(userService.deleteUser(id));
    }

    @ApiOperation(value = "登录",notes = "登录", httpMethod = "POST")
    @PostMapping("/login")
    public Response<UserDetail> login(@ApiParam(name = "userName", value = "用户名", required = true)
                                      @RequestParam(value = "userName")String userName,
                                      @ApiParam(name = "password", value = "密码", required = true)
                                      @RequestParam(value = "password")String password)
    {
        return ResultGenerator.genSuccessResult(userService.login(userName,password));
    }
    @ApiOperation(value = "判断用户名是否存在",notes = "判断用户名是否存在", httpMethod = "GET")
    @GetMapping("/username")
    public Response<Boolean> findUserName(@ApiParam(name = "userName", value = "用户名", required = true)
                                      @RequestParam(value = "userName")String userName)
    {
        Boolean aBoolean = userService.findUserName(userName);
        return ResultGenerator.genSuccessResult(aBoolean);
    }
    @ApiOperation(value = "注册用户",notes = "注册用户", httpMethod = "POST")
    @PostMapping("/register")
    public Response<UserDetail> register(@RequestBody UserDetail userDetail){
        return ResultGenerator.genSuccessResult(userService.register(userDetail));
    }

    @ApiOperation(value = "根据用户名查询用户信息",notes = "根据用户名查询用户信息", httpMethod = "GET")
    @GetMapping("")
    public Response<Boolean> findByUserName(@ApiParam(name = "userName", value = "用户名", required = true)
                                          @RequestParam(value = "userName")String userName)
    {
        UserDetail userDetail = userService.findByUserName(userName);
        return ResultGenerator.genSuccessResult(userDetail);
    }

}
