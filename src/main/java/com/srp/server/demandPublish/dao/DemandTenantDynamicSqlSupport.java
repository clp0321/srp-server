package com.srp.server.demandPublish.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DemandTenantDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DemandTenant demandTenant = new DemandTenant();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = demandTenant.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> userId = demandTenant.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> position = demandTenant.position;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> specify = demandTenant.specify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Double> lowPrice = demandTenant.lowPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Double> highPrice = demandTenant.highPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> method = demandTenant.method;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> creidt = demandTenant.creidt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> tenStatus = demandTenant.tenStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> createTime = demandTenant.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> other = demandTenant.other;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> updateTime = demandTenant.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DemandTenant extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> position = column("position", JDBCType.VARCHAR);

        public final SqlColumn<Integer> specify = column("specify", JDBCType.INTEGER);

        public final SqlColumn<Double> lowPrice = column("low_price", JDBCType.DOUBLE);

        public final SqlColumn<Double> highPrice = column("high_price", JDBCType.DOUBLE);

        public final SqlColumn<Integer> method = column("method", JDBCType.INTEGER);

        public final SqlColumn<Integer> creidt = column("creidt", JDBCType.INTEGER);

        public final SqlColumn<Integer> tenStatus = column("ten_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> createTime = column("create_time", JDBCType.INTEGER);

        public final SqlColumn<String> other = column("other", JDBCType.VARCHAR);

        public final SqlColumn<Integer> updateTime = column("update_time", JDBCType.INTEGER);

        public DemandTenant() {
            super("demand_tenant");
        }
    }
}