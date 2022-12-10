package com.srp.server.houseManage.dao;

import static com.srp.server.houseManage.dao.HouseRentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.srp.server.houseManage.model.HouseRent;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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

@Mapper
public interface HouseRentMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HouseRent> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseRentResult")
    HouseRent selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseRentResult", value = {
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="house_hash", property="houseHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.INTEGER),
        @Result(column="payway", property="payway", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="publisher", property="publisher", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseRent> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(houseRent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseRent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String houseId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseRent)
                .where(houseId, isEqualTo(houseId_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HouseRent record) {
        return insert(SqlBuilder.insert(record)
                .into(houseRent)
                .map(houseId).toProperty("houseId")
                .map(houseHash).toProperty("houseHash")
                .map(method).toProperty("method")
                .map(payway).toProperty("payway")
                .map(price).toProperty("price")
                .map(phone).toProperty("phone")
                .map(updateTime).toProperty("updateTime")
                .map(description).toProperty("description")
                .map(publisher).toProperty("publisher")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HouseRent record) {
        return insert(SqlBuilder.insert(record)
                .into(houseRent)
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(houseHash).toPropertyWhenPresent("houseHash", record::getHouseHash)
                .map(method).toPropertyWhenPresent("method", record::getMethod)
                .map(payway).toPropertyWhenPresent("payway", record::getPayway)
                .map(price).toPropertyWhenPresent("price", record::getPrice)
                .map(phone).toPropertyWhenPresent("phone", record::getPhone)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(publisher).toPropertyWhenPresent("publisher", record::getPublisher)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseRent>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, houseId, houseHash, method, payway, price, phone, updateTime, description, publisher)
                .from(houseRent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseRent>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, houseId, houseHash, method, payway, price, phone, updateTime, description, publisher)
                .from(houseRent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HouseRent selectByPrimaryKey(String houseId_) {
        return SelectDSL.selectWithMapper(this::selectOne, houseId, houseHash, method, payway, price, phone, updateTime, description, publisher)
                .from(houseRent)
                .where(houseId, isEqualTo(houseId_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HouseRent record) {
        return UpdateDSL.updateWithMapper(this::update, houseRent)
                .set(houseId).equalTo(record::getHouseId)
                .set(houseHash).equalTo(record::getHouseHash)
                .set(method).equalTo(record::getMethod)
                .set(payway).equalTo(record::getPayway)
                .set(price).equalTo(record::getPrice)
                .set(phone).equalTo(record::getPhone)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(description).equalTo(record::getDescription)
                .set(publisher).equalTo(record::getPublisher);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HouseRent record) {
        return UpdateDSL.updateWithMapper(this::update, houseRent)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(houseHash).equalToWhenPresent(record::getHouseHash)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(payway).equalToWhenPresent(record::getPayway)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(publisher).equalToWhenPresent(record::getPublisher);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HouseRent record) {
        return UpdateDSL.updateWithMapper(this::update, houseRent)
                .set(houseHash).equalTo(record::getHouseHash)
                .set(method).equalTo(record::getMethod)
                .set(payway).equalTo(record::getPayway)
                .set(price).equalTo(record::getPrice)
                .set(phone).equalTo(record::getPhone)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(description).equalTo(record::getDescription)
                .set(publisher).equalTo(record::getPublisher)
                .where(houseId, isEqualTo(record::getHouseId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HouseRent record) {
        return UpdateDSL.updateWithMapper(this::update, houseRent)
                .set(houseHash).equalToWhenPresent(record::getHouseHash)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(payway).equalToWhenPresent(record::getPayway)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(publisher).equalToWhenPresent(record::getPublisher)
                .where(houseId, isEqualTo(record::getHouseId))
                .build()
                .execute();
    }
}