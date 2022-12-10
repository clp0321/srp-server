package com.srp.server.houseManage.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HouseDeviceDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final HouseDevice houseDevice = new HouseDevice();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviceId = houseDevice.deviceId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = houseDevice.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviceType = houseDevice.deviceType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviceStatus = houseDevice.deviceStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviceCode = houseDevice.deviceCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = houseDevice.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class HouseDevice extends SqlTable {
        public final SqlColumn<String> deviceId = column("device_id", JDBCType.VARCHAR);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceType = column("device_type", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceStatus = column("device_status", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceCode = column("device_code", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public HouseDevice() {
            super("house_device");
        }
    }
}