package com.srp.server.houseManage.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class HouseManageDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final HouseManage houseManage = new HouseManage();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = houseManage.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = houseManage.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseOwner = houseManage.houseOwner;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> certNum = houseManage.certNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Double> size = houseManage.size;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> struct = houseManage.struct;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> province = houseManage.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = houseManage.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> country = houseManage.country;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> position = houseManage.position;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> houseStatus = houseManage.houseStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> specify = houseManage.specify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> agency = houseManage.agency;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviceId = houseManage.deviceId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> authTime = houseManage.authTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseHash = houseManage.houseHash;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> method = houseManage.method;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> payway = houseManage.payway;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Double> price = houseManage.price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = houseManage.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = houseManage.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = houseManage.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> publisher = houseManage.publisher;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> picUrl = houseManage.picUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class HouseManage extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> houseOwner = column("house_owner", JDBCType.VARCHAR);

        public final SqlColumn<String> certNum = column("cert_num", JDBCType.VARCHAR);

        public final SqlColumn<Double> size = column("size", JDBCType.DOUBLE);

        public final SqlColumn<String> struct = column("struct", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> country = column("country", JDBCType.VARCHAR);

        public final SqlColumn<String> position = column("position", JDBCType.VARCHAR);

        public final SqlColumn<Integer> houseStatus = column("house_status", JDBCType.INTEGER);

        public final SqlColumn<String> specify = column("specify", JDBCType.VARCHAR);

        public final SqlColumn<String> agency = column("agency", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceId = column("device_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> authTime = column("auth_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> houseHash = column("house_hash", JDBCType.VARCHAR);

        public final SqlColumn<Integer> method = column("method", JDBCType.INTEGER);

        public final SqlColumn<Integer> payway = column("payway", JDBCType.INTEGER);

        public final SqlColumn<Double> price = column("price", JDBCType.DOUBLE);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> publisher = column("publisher", JDBCType.VARCHAR);

        public final SqlColumn<String> picUrl = column("pic_url", JDBCType.VARCHAR);

        public HouseManage() {
            super("house_manage");
        }
    }
}