package com.srp.server.houseManage.dao;

import com.srp.server.houseManage.model.HouseReview;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import javax.annotation.Generated;
import java.util.List;

import static com.srp.server.houseManage.dao.HouseReviewDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface HouseReviewMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<HouseReview> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseReviewResult")
    HouseReview selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseReviewResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="spname", property="spname", jdbcType=JdbcType.VARCHAR),
        @Result(column="wallet", property="wallet", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_num", property="cardNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_index", property="cardIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="cert_index", property="certIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="rev_status", property="revStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="hash", property="hash", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseReview> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(houseReview);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseReview);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseReview)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HouseReview record) {
        return insert(SqlBuilder.insert(record)
                .into(houseReview)
//                .map(id).toProperty("id")
                .map(houseId).toProperty("houseId")
                .map(spname).toProperty("spname")
                .map(wallet).toProperty("wallet")
                .map(cardNum).toProperty("cardNum")
                .map(cardIndex).toProperty("cardIndex")
                .map(certIndex).toProperty("certIndex")
                .map(revStatus).toProperty("revStatus")
                .map(createTime).toProperty("createTime")
                .map(updateBy).toProperty("updateBy")
                .map(updateTime).toProperty("updateTime")
                .map(hash).toProperty("hash")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HouseReview record) {
        return insert(SqlBuilder.insert(record)
                .into(houseReview)
                .map(id).toProperty("id")
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(spname).toPropertyWhenPresent("spname", record::getSpname)
                .map(wallet).toPropertyWhenPresent("wallet", record::getWallet)
                .map(cardNum).toPropertyWhenPresent("cardNum", record::getCardNum)
                .map(cardIndex).toPropertyWhenPresent("cardIndex", record::getCardIndex)
                .map(certIndex).toPropertyWhenPresent("certIndex", record::getCertIndex)
                .map(revStatus).toPropertyWhenPresent("revStatus", record::getRevStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(hash).toPropertyWhenPresent("hash", record::getHash)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseReview>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, houseId, spname, wallet, cardNum, cardIndex, certIndex, revStatus, createTime, updateBy, updateTime, hash)
                .from(houseReview);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseReview>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, houseId, spname, wallet, cardNum, cardIndex, certIndex, revStatus, createTime, updateBy, updateTime, hash)
                .from(houseReview);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HouseReview selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, houseId, spname, wallet, cardNum, cardIndex, certIndex, revStatus, createTime, updateBy, updateTime, hash)
                .from(houseReview)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HouseReview record) {
        return UpdateDSL.updateWithMapper(this::update, houseReview)
                .set(id).equalTo(record::getId)
                .set(houseId).equalTo(record::getHouseId)
                .set(spname).equalTo(record::getSpname)
                .set(wallet).equalTo(record::getWallet)
                .set(cardNum).equalTo(record::getCardNum)
                .set(cardIndex).equalTo(record::getCardIndex)
                .set(certIndex).equalTo(record::getCertIndex)
                .set(revStatus).equalTo(record::getRevStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(hash).equalTo(record::getHash);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HouseReview record) {
        return UpdateDSL.updateWithMapper(this::update, houseReview)
                .set(id).equalToWhenPresent(record::getId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(spname).equalToWhenPresent(record::getSpname)
                .set(wallet).equalToWhenPresent(record::getWallet)
                .set(cardNum).equalToWhenPresent(record::getCardNum)
                .set(cardIndex).equalToWhenPresent(record::getCardIndex)
                .set(certIndex).equalToWhenPresent(record::getCertIndex)
                .set(revStatus).equalToWhenPresent(record::getRevStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(hash).equalToWhenPresent(record::getHash);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HouseReview record) {
        return UpdateDSL.updateWithMapper(this::update, houseReview)
                .set(houseId).equalTo(record::getHouseId)
                .set(spname).equalTo(record::getSpname)
                .set(wallet).equalTo(record::getWallet)
                .set(cardNum).equalTo(record::getCardNum)
                .set(cardIndex).equalTo(record::getCardIndex)
                .set(certIndex).equalTo(record::getCertIndex)
                .set(revStatus).equalTo(record::getRevStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(hash).equalTo(record::getHash)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HouseReview record) {
        return UpdateDSL.updateWithMapper(this::update, houseReview)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(spname).equalToWhenPresent(record::getSpname)
                .set(wallet).equalToWhenPresent(record::getWallet)
                .set(cardNum).equalToWhenPresent(record::getCardNum)
                .set(cardIndex).equalToWhenPresent(record::getCardIndex)
                .set(certIndex).equalToWhenPresent(record::getCertIndex)
                .set(revStatus).equalToWhenPresent(record::getRevStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(hash).equalToWhenPresent(record::getHash)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}