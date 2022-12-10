package com.srp.server.houseManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class HouseReview {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String spname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String wallet;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String certIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer revStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String hash;

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
    public String getSpname() {
        return spname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSpname(String spname) {
        this.spname = spname == null ? null : spname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getWallet() {
        return wallet;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWallet(String wallet) {
        this.wallet = wallet == null ? null : wallet.trim();
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
    public Integer getRevStatus() {
        return revStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRevStatus(Integer revStatus) {
        this.revStatus = revStatus;
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
    public String getHash() {
        return hash;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        return "HouseReview{" +
                "id=" + id +
                ", houseId='" + houseId + '\'' +
                ", spname='" + spname + '\'' +
                ", wallet='" + wallet + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cardIndex='" + cardIndex + '\'' +
                ", certIndex='" + certIndex + '\'' +
                ", revStatus=" + revStatus +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                ", hash='" + hash + '\'' +
                '}';
    }
}