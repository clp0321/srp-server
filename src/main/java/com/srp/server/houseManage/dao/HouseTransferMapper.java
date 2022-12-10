package com.srp.server.houseManage.dao;

import com.srp.server.houseManage.model.HouseTransfer;
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

import static com.srp.server.houseManage.dao.HouseTransferDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface HouseTransferMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<HouseTransfer> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseTransferResult")
    HouseTransfer selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseTransferResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name_call", property="nameCall", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_call", property="cardCall", jdbcType=JdbcType.VARCHAR),
        @Result(column="name_rec", property="nameRec", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_rec", property="cardRec", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_index", property="cardIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_index_rec", property="cardIndexRec", jdbcType=JdbcType.VARCHAR),
        @Result(column="cert_index", property="certIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="transfer_status", property="transferStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="hash", property="hash", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseTransfer> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(houseTransfer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseTransfer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseTransfer)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HouseTransfer record) {
        return insert(SqlBuilder.insert(record)
                .into(houseTransfer)
//                .map(id).toProperty("id")
                .map(houseId).toProperty("houseId")
                .map(nameCall).toProperty("nameCall")
                .map(cardCall).toProperty("cardCall")
                .map(nameRec).toProperty("nameRec")
                .map(cardRec).toProperty("cardRec")
                .map(cardIndex).toProperty("cardIndex")
                .map(cardIndexRec).toProperty("cardIndexRec")
                .map(certIndex).toProperty("certIndex")
                .map(createTime).toProperty("createTime")
                .map(updateBy).toProperty("updateBy")
                .map(updateTime).toProperty("updateTime")
                .map(transferStatus).toProperty("transferStatus")
                .map(hash).toProperty("hash")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HouseTransfer record) {
        return insert(SqlBuilder.insert(record)
                .into(houseTransfer)
                .map(id).toProperty("id")
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(nameCall).toPropertyWhenPresent("nameCall", record::getNameCall)
                .map(cardCall).toPropertyWhenPresent("cardCall", record::getCardCall)
                .map(nameRec).toPropertyWhenPresent("nameRec", record::getNameRec)
                .map(cardRec).toPropertyWhenPresent("cardRec", record::getCardRec)
                .map(cardIndex).toPropertyWhenPresent("cardIndex", record::getCardIndex)
                .map(cardIndexRec).toPropertyWhenPresent("cardIndexRec", record::getCardIndexRec)
                .map(certIndex).toPropertyWhenPresent("certIndex", record::getCertIndex)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(transferStatus).toPropertyWhenPresent("transferStatus", record::getTransferStatus)
                .map(hash).toPropertyWhenPresent("hash", record::getHash)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseTransfer>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, houseId, nameCall, cardCall, nameRec, cardRec, cardIndex, cardIndexRec, certIndex, createTime, updateBy, updateTime, transferStatus, hash)
                .from(houseTransfer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseTransfer>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, houseId, nameCall, cardCall, nameRec, cardRec, cardIndex, cardIndexRec, certIndex, createTime, updateBy, updateTime, transferStatus, hash)
                .from(houseTransfer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HouseTransfer selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, houseId, nameCall, cardCall, nameRec, cardRec, cardIndex, cardIndexRec, certIndex, createTime, updateBy, updateTime, transferStatus, hash)
                .from(houseTransfer)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HouseTransfer record) {
        return UpdateDSL.updateWithMapper(this::update, houseTransfer)
                .set(id).equalTo(record::getId)
                .set(houseId).equalTo(record::getHouseId)
                .set(nameCall).equalTo(record::getNameCall)
                .set(cardCall).equalTo(record::getCardCall)
                .set(nameRec).equalTo(record::getNameRec)
                .set(cardRec).equalTo(record::getCardRec)
                .set(cardIndex).equalTo(record::getCardIndex)
                .set(cardIndexRec).equalTo(record::getCardIndexRec)
                .set(certIndex).equalTo(record::getCertIndex)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(transferStatus).equalTo(record::getTransferStatus)
                .set(hash).equalTo(record::getHash);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HouseTransfer record) {
        return UpdateDSL.updateWithMapper(this::update, houseTransfer)
                .set(id).equalToWhenPresent(record::getId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(nameCall).equalToWhenPresent(record::getNameCall)
                .set(cardCall).equalToWhenPresent(record::getCardCall)
                .set(nameRec).equalToWhenPresent(record::getNameRec)
                .set(cardRec).equalToWhenPresent(record::getCardRec)
                .set(cardIndex).equalToWhenPresent(record::getCardIndex)
                .set(cardIndexRec).equalToWhenPresent(record::getCardIndexRec)
                .set(certIndex).equalToWhenPresent(record::getCertIndex)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(transferStatus).equalToWhenPresent(record::getTransferStatus)
                .set(hash).equalToWhenPresent(record::getHash);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HouseTransfer record) {
        return UpdateDSL.updateWithMapper(this::update, houseTransfer)
                .set(houseId).equalTo(record::getHouseId)
                .set(nameCall).equalTo(record::getNameCall)
                .set(cardCall).equalTo(record::getCardCall)
                .set(nameRec).equalTo(record::getNameRec)
                .set(cardRec).equalTo(record::getCardRec)
                .set(cardIndex).equalTo(record::getCardIndex)
                .set(cardIndexRec).equalTo(record::getCardIndexRec)
                .set(certIndex).equalTo(record::getCertIndex)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(transferStatus).equalTo(record::getTransferStatus)
                .set(hash).equalTo(record::getHash)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HouseTransfer record) {
        return UpdateDSL.updateWithMapper(this::update, houseTransfer)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(nameCall).equalToWhenPresent(record::getNameCall)
                .set(cardCall).equalToWhenPresent(record::getCardCall)
                .set(nameRec).equalToWhenPresent(record::getNameRec)
                .set(cardRec).equalToWhenPresent(record::getCardRec)
                .set(cardIndex).equalToWhenPresent(record::getCardIndex)
                .set(cardIndexRec).equalToWhenPresent(record::getCardIndexRec)
                .set(certIndex).equalToWhenPresent(record::getCertIndex)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(transferStatus).equalToWhenPresent(record::getTransferStatus)
                .set(hash).equalToWhenPresent(record::getHash)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}