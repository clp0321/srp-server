package com.srp.server.houseManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class HouseRevoke {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sponName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String certIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer houseStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String revokeHash;

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
    public String getSponName() {
        return sponName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSponName(String sponName) {
        this.sponName = sponName == null ? null : sponName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCardNum() {
        return cardNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCardIndex() {
        return cardIndex;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCardIndex(String cardIndex) {
        this.cardIndex = cardIndex == null ? null : cardIndex.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCertIndex() {
        return certIndex;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCertIndex(String certIndex) {
        this.certIndex = certIndex == null ? null : certIndex.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHouseStatus() {
        return houseStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHouseStatus(Integer houseStatus) {
        this.houseStatus = houseStatus;
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
    public String getUpdateBy() {
        return updateBy;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
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
    public String getRevokeHash() {
        return revokeHash;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRevokeHash(String revokeHash) {
        this.revokeHash = revokeHash == null ? null : revokeHash.trim();
    }
}