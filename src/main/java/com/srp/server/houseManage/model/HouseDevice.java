package com.srp.server.houseManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class HouseDevice {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deviceId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deviceType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deviceStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deviceCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeviceId() {
        return deviceId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
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
    public String getDeviceType() {
        return deviceType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeviceStatus() {
        return deviceStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus == null ? null : deviceStatus.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeviceCode() {
        return deviceCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        return "HouseDevice{" +
                "deviceId='" + deviceId + '\'' +
                ", houseId='" + houseId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceStatus='" + deviceStatus + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}