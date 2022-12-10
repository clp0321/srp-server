package com.srp.server.houseManage.dao;

import com.srp.server.houseManage.model.HouseRevoke;
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

import static com.srp.server.houseManage.dao.HouseRevokeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface HouseRevokeMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<HouseRevoke> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseRevokeResult")
    HouseRevoke selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseRevokeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="spon_name", property="sponName", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_num", property="cardNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_index", property="cardIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="cert_index", property="certIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_status", property="houseStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="revoke_hash", property="revokeHash", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseRevoke> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(houseRevoke);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseRevoke);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseRevoke)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HouseRevoke record) {
        return insert(SqlBuilder.insert(record)
                .into(houseRevoke)
//                .map(id).toProperty("id")
                .map(houseId).toProperty("houseId")
                .map(sponName).toProperty("sponName")
                .map(cardNum).toProperty("cardNum")
                .map(cardIndex).toProperty("cardIndex")
                .map(certIndex).toProperty("certIndex")
                .map(houseStatus).toProperty("houseStatus")
                .map(createTime).toProperty("createTime")
                .map(updateBy).toProperty("updateBy")
                .map(updateTime).toProperty("updateTime")
                .map(revokeHash).toProperty("revokeHash")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HouseRevoke record) {
        return insert(SqlBuilder.insert(record)
                .into(houseRevoke)
                .map(id).toProperty("id")
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(sponName).toPropertyWhenPresent("sponName", record::getSponName)
                .map(cardNum).toPropertyWhenPresent("cardNum", record::getCardNum)
                .map(cardIndex).toPropertyWhenPresent("cardIndex", record::getCardIndex)
                .map(certIndex).toPropertyWhenPresent("certIndex", record::getCertIndex)
                .map(houseStatus).toPropertyWhenPresent("houseStatus", record::getHouseStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(revokeHash).toPropertyWhenPresent("revokeHash", record::getRevokeHash)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseRevoke>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, houseId, sponName, cardNum, cardIndex, certIndex, houseStatus, createTime, updateBy, updateTime, revokeHash)
                .from(houseRevoke);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseRevoke>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, houseId, sponName, cardNum, cardIndex, certIndex, houseStatus, createTime, updateBy, updateTime, revokeHash)
                .from(houseRevoke);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HouseRevoke selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, houseId, sponName, cardNum, cardIndex, certIndex, houseStatus, createTime, updateBy, updateTime, revokeHash)
                .from(houseRevoke)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HouseRevoke record) {
        return UpdateDSL.updateWithMapper(this::update, houseRevoke)
                .set(id).equalTo(record::getId)
                .set(houseId).equalTo(record::getHouseId)
                .set(sponName).equalTo(record::getSponName)
                .set(cardNum).equalTo(record::getCardNum)
                .set(cardIndex).equalTo(record::getCardIndex)
                .set(certIndex).equalTo(record::getCertIndex)
                .set(houseStatus).equalTo(record::getHouseStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(revokeHash).equalTo(record::getRevokeHash);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HouseRevoke record) {
        return UpdateDSL.updateWithMapper(this::update, houseRevoke)
                .set(id).equalToWhenPresent(record::getId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(sponName).equalToWhenPresent(record::getSponName)
                .set(cardNum).equalToWhenPresent(record::getCardNum)
                .set(cardIndex).equalToWhenPresent(record::getCardIndex)
                .set(certIndex).equalToWhenPresent(record::getCertIndex)
                .set(houseStatus).equalToWhenPresent(record::getHouseStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(revokeHash).equalToWhenPresent(record::getRevokeHash);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HouseRevoke record) {
        return UpdateDSL.updateWithMapper(this::update, houseRevoke)
                .set(houseId).equalTo(record::getHouseId)
                .set(sponName).equalTo(record::getSponName)
                .set(cardNum).equalTo(record::getCardNum)
                .set(cardIndex).equalTo(record::getCardIndex)
                .set(certIndex).equalTo(record::getCertIndex)
                .set(houseStatus).equalTo(record::getHouseStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(revokeHash).equalTo(record::getRevokeHash)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HouseRevoke record) {
        return UpdateDSL.updateWithMapper(this::update, houseRevoke)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(sponName).equalToWhenPresent(record::getSponName)
                .set(cardNum).equalToWhenPresent(record::getCardNum)
                .set(cardIndex).equalToWhenPresent(record::getCardIndex)
                .set(certIndex).equalToWhenPresent(record::getCertIndex)
                .set(houseStatus).equalToWhenPresent(record::getHouseStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(revokeHash).equalToWhenPresent(record::getRevokeHash)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}