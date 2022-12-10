package com.srp.server.houseManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class HouseRent {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseHash;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer method;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer payway;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Double price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String publisher;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHouseId() {
        return houseId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHouseHash() {
        return houseHash;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHouseHash(String houseHash) {
        this.houseHash = houseHash == null ? null : houseHash.trim();
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
    public Integer getPayway() {
        return payway;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayway(Integer payway) {
        this.payway = payway;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Double getPrice() {
        return price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrice(Double price) {
        this.price = price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPhone() {
        return phone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPublisher() {
        return publisher;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }
    @Generated("org.mybatis.generator.api.MyBatisGenerator")

    @Override
    public String toString() {
        return "HouseRent{" +
                "houseId='" + houseId + '\'' +
                ", houseHash='" + houseHash + '\'' +
                ", method=" + method +
                ", payway=" + payway +
                ", price=" + price +
                ", phone='" + phone + '\'' +
                ", updateTime=" + updateTime +
                ", description='" + description + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}