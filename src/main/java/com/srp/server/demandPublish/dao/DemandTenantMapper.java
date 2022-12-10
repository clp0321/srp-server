package com.srp.server.demandPublish.dao;

import static com.srp.server.demandPublish.dao.DemandTenantDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.srp.server.demandPublish.model.DemandTenant;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface DemandTenantMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<DemandTenant> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DemandTenantResult")
    DemandTenant selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DemandTenantResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="specify", property="specify", jdbcType=JdbcType.INTEGER),
        @Result(column="low_price", property="lowPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="high_price", property="highPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="method", property="method", jdbcType=JdbcType.INTEGER),
        @Result(column="creidt", property="creidt", jdbcType=JdbcType.INTEGER),
        @Result(column="ten_status", property="tenStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.INTEGER),
        @Result(column="other", property="other", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.INTEGER)
    })
    List<DemandTenant> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(demandTenant);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, demandTenant);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, demandTenant)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DemandTenant record) {
        return insert(SqlBuilder.insert(record)
                .into(demandTenant)
//                .map(id).toProperty("id")
                .map(userId).toProperty("userId")
                .map(position).toProperty("position")
                .map(specify).toProperty("specify")
                .map(lowPrice).toProperty("lowPrice")
                .map(highPrice).toProperty("highPrice")
                .map(method).toProperty("method")
                .map(creidt).toProperty("creidt")
                .map(tenStatus).toProperty("tenStatus")
                .map(createTime).toProperty("createTime")
                .map(other).toProperty("other")
                .map(updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(DemandTenant record) {
        return insert(SqlBuilder.insert(record)
                .into(demandTenant)
                .map(id).toProperty("id")
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(position).toPropertyWhenPresent("position", record::getPosition)
                .map(specify).toPropertyWhenPresent("specify", record::getSpecify)
                .map(lowPrice).toPropertyWhenPresent("lowPrice", record::getLowPrice)
                .map(highPrice).toPropertyWhenPresent("highPrice", record::getHighPrice)
                .map(method).toPropertyWhenPresent("method", record::getMethod)
                .map(creidt).toPropertyWhenPresent("creidt", record::getCreidt)
                .map(tenStatus).toPropertyWhenPresent("tenStatus", record::getTenStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(other).toPropertyWhenPresent("other", record::getOther)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DemandTenant>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, position, specify, lowPrice, highPrice, method, creidt, tenStatus, createTime, other, updateTime)
                .from(demandTenant);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DemandTenant>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, position, specify, lowPrice, highPrice, method, creidt, tenStatus, createTime, other, updateTime)
                .from(demandTenant);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DemandTenant selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, position, specify, lowPrice, highPrice, method, creidt, tenStatus, createTime, other, updateTime)
                .from(demandTenant)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DemandTenant record) {
        return UpdateDSL.updateWithMapper(this::update, demandTenant)
                .set(id).equalTo(record::getId)
                .set(userId).equalTo(record::getUserId)
                .set(position).equalTo(record::getPosition)
                .set(specify).equalTo(record::getSpecify)
                .set(lowPrice).equalTo(record::getLowPrice)
                .set(highPrice).equalTo(record::getHighPrice)
                .set(method).equalTo(record::getMethod)
                .set(creidt).equalTo(record::getCreidt)
                .set(tenStatus).equalTo(record::getTenStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(other).equalTo(record::getOther)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DemandTenant record) {
        return UpdateDSL.updateWithMapper(this::update, demandTenant)
                .set(id).equalToWhenPresent(record::getId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(specify).equalToWhenPresent(record::getSpecify)
                .set(lowPrice).equalToWhenPresent(record::getLowPrice)
                .set(highPrice).equalToWhenPresent(record::getHighPrice)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(creidt).equalToWhenPresent(record::getCreidt)
                .set(tenStatus).equalToWhenPresent(record::getTenStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(other).equalToWhenPresent(record::getOther)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(DemandTenant record) {
        return UpdateDSL.updateWithMapper(this::update, demandTenant)
                .set(userId).equalTo(record::getUserId)
                .set(position).equalTo(record::getPosition)
                .set(specify).equalTo(record::getSpecify)
                .set(lowPrice).equalTo(record::getLowPrice)
                .set(highPrice).equalTo(record::getHighPrice)
                .set(method).equalTo(record::getMethod)
                .set(creidt).equalTo(record::getCreidt)
                .set(tenStatus).equalTo(record::getTenStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(other).equalTo(record::getOther)
                .set(updateTime).equalTo(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(DemandTenant record) {
        return UpdateDSL.updateWithMapper(this::update, demandTenant)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(specify).equalToWhenPresent(record::getSpecify)
                .set(lowPrice).equalToWhenPresent(record::getLowPrice)
                .set(highPrice).equalToWhenPresent(record::getHighPrice)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(creidt).equalToWhenPresent(record::getCreidt)
                .set(tenStatus).equalToWhenPresent(record::getTenStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(other).equalToWhenPresent(record::getOther)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}