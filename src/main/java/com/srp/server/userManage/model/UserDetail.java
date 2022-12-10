package com.srp.server.userManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class UserDetail {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String addressName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer role;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String certId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String address;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String avatar;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userHash;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updatedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAddressName() {
        return addressName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRole() {
        return role;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRole(Integer role) {
        this.role = role;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCertId() {
        return certId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCertId(String certId) {
        this.certId = certId == null ? null : certId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
    public String getAddress() {
        return address;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAvatar() {
        return avatar;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserHash() {
        return userHash;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserHash(String userHash) {
        this.userHash = userHash == null ? null : userHash.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreatedTime() {
        return createdTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdatedTime() {
        return updatedTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", addressName='" + addressName + '\'' +
                ", role=" + role +
                ", certId='" + certId + '\'' +
                ", status='" + status + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                ", userHash='" + userHash + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}