package com.srp.server.houseManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class HousePic {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String picMessage;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String username;

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
    public String getPicMessage() {
        return picMessage;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPicMessage(String picMessage) {
        this.picMessage = picMessage == null ? null : picMessage.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUsername() {
        return username;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        return "HousePic{" +
                "id=" + id +
                ", houseId='" + houseId + '\'' +
                ", picMessage='" + picMessage + '\'' +
                ", createTime=" + createTime +
                ", username='" + username + '\'' +
                '}';
    }
}