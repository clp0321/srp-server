package com.srp.server.houseManage.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HouseTransferDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final HouseTransfer houseTransfer = new HouseTransfer();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = houseTransfer.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = houseTransfer.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nameCall = houseTransfer.nameCall;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardCall = houseTransfer.cardCall;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nameRec = houseTransfer.nameRec;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardRec = houseTransfer.cardRec;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardIndex = houseTransfer.cardIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardIndexRec = houseTransfer.cardIndexRec;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> certIndex = houseTransfer.certIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = houseTransfer.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> updateBy = houseTransfer.updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = houseTransfer.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> transferStatus = houseTransfer.transferStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hash = houseTransfer.hash;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class HouseTransfer extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> nameCall = column("name_call", JDBCType.VARCHAR);

        public final SqlColumn<String> cardCall = column("card_call", JDBCType.VARCHAR);

        public final SqlColumn<String> nameRec = column("name_rec", JDBCType.VARCHAR);

        public final SqlColumn<String> cardRec = column("card_rec", JDBCType.VARCHAR);

        public final SqlColumn<String> cardIndex = column("card_index", JDBCType.VARCHAR);

        public final SqlColumn<String> cardIndexRec = column("card_index_rec", JDBCType.VARCHAR);

        public final SqlColumn<String> certIndex = column("cert_index", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> transferStatus = column("transfer_status", JDBCType.INTEGER);

        public final SqlColumn<String> hash = column("hash", JDBCType.VARCHAR);

        public HouseTransfer() {
            super("house_transfer");
        }
    }
}