package com.srp.server.applyManage.service;

import com.srp.server.applyManage.model.ApplyManage;

import java.util.List;

public interface ApplyManageService {
    //发送申请看房请求
    Integer sendApply(ApplyManage applyManage);

    //根据用户名查询已申请房源
    List<ApplyManage> findApplyMessageByUserName(String user_name);

    //根据用户名查询已同意的请求
    List<ApplyManage> findAccetpMessageByUserName(String user_name);

    //房东处理看房请求
    Integer handelApply(ApplyManage applyManage);

    //根据房东姓名查询需要处理的申请看房信息
    List<ApplyManage> findHandleMessageByHouserName(String houser_name);

    //根据房东姓名查询处理完成的申请看房信息
    List<ApplyManage> findApplyMessageByHouserName(String houser_name);

}
