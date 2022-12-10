package com.srp.server.applyManage.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ApplyManageDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ApplyManage applyManage = new ApplyManage();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = applyManage.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = applyManage.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userName = applyManage.userName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houserName = applyManage.houserName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> applyTime = applyManage.applyTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviceNum = applyManage.deviceNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> applyStatus = applyManage.applyStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> password = applyManage.password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> passwordTime = applyManage.passwordTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ApplyManage extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<String> houserName = column("houser_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> applyTime = column("apply_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> deviceNum = column("device_num", JDBCType.VARCHAR);

        public final SqlColumn<Integer> applyStatus = column("apply_status", JDBCType.INTEGER);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> passwordTime = column("password_time", JDBCType.VARCHAR);

        public ApplyManage() {
            super("apply_manage");
        }
    }
}