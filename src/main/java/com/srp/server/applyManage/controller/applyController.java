package com.srp.server.applyManage.controller;

import com.srp.server.applyManage.model.ApplyManage;
import com.srp.server.applyManage.service.ApplyManageService;
import com.srp.server.config.data.Response;
import com.srp.server.config.data.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@Api(tags = "申请看房")
@RestController
@RequestMapping("/apply")
public class applyController {

    @Autowired
    private ApplyManageService applyManageService;

//    @Autowired
//    private  ApplyManage applyManage;

    @ApiOperation(value = "根据用户名查询已申请房源",notes = "根据用户名查询已申请房源", httpMethod = "GET")
    @GetMapping("/user")
    public Response<List<ApplyManage>> findApplyMessageByUserName(@ApiParam(name = "userName", value = "用户名", required = true)
                                                                     @RequestParam(value = "userName")String userName){
        return ResultGenerator.genSuccessResult(applyManageService.findApplyMessageByUserName(userName));
    }

    @ApiOperation(value = "根据用户名查询已同意的请求",notes = "根据用户名查询已同意的请求", httpMethod = "GET")
    @GetMapping("/userAccept")
    public Response<List<ApplyManage>> findAcceptMessageByUserName(@ApiParam(name = "userName", value = "用户名", required = true)
                                                                 @RequestParam(value = "userName")String userName){
        return ResultGenerator.genSuccessResult(applyManageService.findAccetpMessageByUserName(userName));
    }

    @ApiOperation(value = "发送申请看房请求",notes = "发送申请看房请求", httpMethod = "POST")
    @PostMapping("")
    public Response<ApplyManage> register(@ApiParam(name = "houseId", value = "房源Id ", required = true)
                                              @RequestParam(value = "houseId")String houseId,
                                          @ApiParam(name = "userName", value = "用户名", required = true)
                                          @RequestParam(value = "userName")String userName,
                                          @ApiParam(name = "houserName", value = "房东姓名", required = true)
                                              @RequestParam(value = "houserName")String houserName,
                                          @ApiParam(name = "applyTime", value = "申请时间")
                                              @RequestParam(value = "applyTime") Date applyTime,
                                          @ApiParam(name = "deviceNum", value = "门锁id")
                                              @RequestParam(value = "deviceNum")String deviceNum){
        ApplyManage applyManage=new ApplyManage();
        applyManage.setHouseId(houseId);
        applyManage.setUserName(userName);
        applyManage.setHouserName(houserName);
        applyManage.setApplyTime(applyTime);
        applyManage.setDeviceNum(deviceNum);
        applyManage.setApplyStatus(2);
        return ResultGenerator.genSuccessResult(applyManageService.sendApply(applyManage));
    }

    @ApiOperation(value = "房东处理看房请求（同意）",notes = "房东处理看房请求（同意）", httpMethod = "PUT")
    @PutMapping("/accept")
    public Response<ApplyManage> acceptApply(@ApiParam(name = "Id", value = "Id ", required = true)
                                                 @RequestParam(value = "Id")Integer id,
                                             @ApiParam(name = "password", value = "密码", required = true)
                                                 @RequestParam(value = "password")String password,
                                             @ApiParam(name = "passwordTime", value = "密码有效期", required = true)
                                                 @RequestParam(value = "passwordTime")String passwordTime)
    {
        ApplyManage applyManage=new ApplyManage();
        applyManage.setId(id);
        applyManage.setPassword(password);
        applyManage.setPasswordTime(passwordTime);
        applyManage.setApplyStatus(1);
        return ResultGenerator.genSuccessResult(applyManageService.handelApply(applyManage));
    }

    @ApiOperation(value = "房东处理看房请求（拒绝）",notes = "房东处理看房请求（拒绝）", httpMethod = "PUT")
    @PutMapping("/refuse")
    public Response<ApplyManage> refuseApply(@ApiParam(name = "Id", value = "Id ", required = true)
                                                 @RequestParam(value = "Id")Integer id
                                             )
    {
        ApplyManage applyManage=new ApplyManage();
        applyManage.setId(id);
        applyManage.setPassword(null);
        applyManage.setPasswordTime(null);
        applyManage.setApplyStatus(0);
        return ResultGenerator.genSuccessResult(applyManageService.handelApply(applyManage));
    }
    @ApiOperation(value = "根据房东姓名查询需要处理的申请看房信息",notes = "根据房东姓名查询需要处理的申请看房信息", httpMethod = "GET")
    @GetMapping("/handle")
    public Response<List<ApplyManage>> findHandleMessageByHouserName(@ApiParam(name = "houserName", value = "房东姓名", required = true)
                                                                  @RequestParam(value = "houserName")String houserName){
        return ResultGenerator.genSuccessResult(applyManageService.findHandleMessageByHouserName(houserName));
    }

    @ApiOperation(value = "根据房东姓名查询处理完成的申请看房信息",notes = "根据房东姓名查询处理完成的申请看房信息", httpMethod = "GET")
    @GetMapping("/houser")
    public Response<List<ApplyManage>> findApplyMessageByHouserName(@ApiParam(name = "houserName", value = "房东姓名", required = true)
                                                                     @RequestParam(value = "houserName")String houserName){
        return ResultGenerator.genSuccessResult(applyManageService.findApplyMessageByHouserName(houserName));
    }
}
