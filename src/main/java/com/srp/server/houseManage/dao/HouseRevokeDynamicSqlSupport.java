package com.srp.server.houseManage.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class HouseRevokeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final HouseRevoke houseRevoke = new HouseRevoke();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = houseRevoke.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = houseRevoke.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sponName = houseRevoke.sponName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardNum = houseRevoke.cardNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardIndex = houseRevoke.cardIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> certIndex = houseRevoke.certIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> houseStatus = houseRevoke.houseStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = houseRevoke.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> updateBy = houseRevoke.updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = houseRevoke.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> revokeHash = houseRevoke.revokeHash;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class HouseRevoke extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> sponName = column("spon_name", JDBCType.VARCHAR);

        public final SqlColumn<String> cardNum = column("card_num", JDBCType.VARCHAR);

        public final SqlColumn<String> cardIndex = column("card_index", JDBCType.VARCHAR);

        public final SqlColumn<String> certIndex = column("cert_index", JDBCType.VARCHAR);

        public final SqlColumn<Integer> houseStatus = column("house_status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> revokeHash = column("revoke_hash", JDBCType.VARCHAR);

        public HouseRevoke() {
            super("house_revoke");
        }
    }
}