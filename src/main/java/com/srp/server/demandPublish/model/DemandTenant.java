package com.srp.server.demandPublish.model;

import javax.annotation.Generated;

public class DemandTenant {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String position;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer specify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Double lowPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Double highPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer method;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer creidt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer tenStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String other;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUserId() {
        return userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPosition() {
        return position;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSpecify() {
        return specify;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSpecify(Integer specify) {
        this.specify = specify;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Double getLowPrice() {
        return lowPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Double getHighPrice() {
        return highPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMethod() {
        return method;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMethod(Integer method) {
        this.method = method;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCreidt() {
        return creidt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreidt(Integer creidt) {
        this.creidt = creidt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getTenStatus() {
        return tenStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTenStatus(Integer tenStatus) {
        this.tenStatus = tenStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOther() {
        return other;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}