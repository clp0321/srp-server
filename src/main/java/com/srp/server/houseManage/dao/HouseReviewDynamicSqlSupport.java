package com.srp.server.houseManage.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HouseReviewDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final HouseReview houseReview = new HouseReview();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = houseReview.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = houseReview.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> spname = houseReview.spname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> wallet = houseReview.wallet;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardNum = houseReview.cardNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cardIndex = houseReview.cardIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> certIndex = houseReview.certIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> revStatus = houseReview.revStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = houseReview.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> updateBy = houseReview.updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = houseReview.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hash = houseReview.hash;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class HouseReview extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> spname = column("spname", JDBCType.VARCHAR);

        public final SqlColumn<String> wallet = column("wallet", JDBCType.VARCHAR);

        public final SqlColumn<String> cardNum = column("card_num", JDBCType.VARCHAR);

        public final SqlColumn<String> cardIndex = column("card_index", JDBCType.VARCHAR);

        public final SqlColumn<String> certIndex = column("cert_index", JDBCType.VARCHAR);

        public final SqlColumn<Integer> revStatus = column("rev_status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> hash = column("hash", JDBCType.VARCHAR);

        public HouseReview() {
            super("house_review");
        }
    }
}