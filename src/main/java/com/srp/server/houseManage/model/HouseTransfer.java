package com.srp.server.houseManage.model;

import java.util.Date;
import javax.annotation.Generated;

public class HouseTransfer {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nameCall;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardCall;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nameRec;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardRec;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cardIndexRec;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String certIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer transferStatus;

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
    public String getNameCall() {
        return nameCall;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNameCall(String nameCall) {
        this.nameCall = nameCall == null ? null : nameCall.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCardCall() {
        return cardCall;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCardCall(String cardCall) {
        this.cardCall = cardCall == null ? null : cardCall.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNameRec() {
        return nameRec;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNameRec(String nameRec) {
        this.nameRec = nameRec == null ? null : nameRec.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCardRec() {
        return cardRec;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCardRec(String cardRec) {
        this.cardRec = cardRec == null ? null : cardRec.trim();
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
    public String getCardIndexRec() {
        return cardIndexRec;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCardIndexRec(String cardIndexRec) {
        this.cardIndexRec = cardIndexRec == null ? null : cardIndexRec.trim();
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
    public Integer getTransferStatus() {
        return transferStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHash() {
        return hash;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }
}