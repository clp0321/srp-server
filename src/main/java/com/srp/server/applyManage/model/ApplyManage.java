package com.srp.server.applyManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class ApplyManage {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houserName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date applyTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deviceNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer applyStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String passwordTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHouseId() {
        return houseId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserName() {
        return userName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHouserName() {
        return houserName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHouserName(String houserName) {
        this.houserName = houserName == null ? null : houserName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getApplyTime() {
        return applyTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeviceNum() {
        return deviceNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getApplyStatus() {
        return applyStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPassword() {
        return password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPasswordTime() {
        return passwordTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPasswordTime(String passwordTime) {
        this.passwordTime = passwordTime == null ? null : passwordTime.trim();
    }
}