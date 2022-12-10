package com.srp.server.applyManage.dao;

import com.srp.server.applyManage.model.ApplyManage;
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

import static com.srp.server.applyManage.dao.ApplyManageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ApplyManageMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<ApplyManage> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ApplyManageResult")
    ApplyManage selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ApplyManageResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="houser_name", property="houserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="apply_time", property="applyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="device_num", property="deviceNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="apply_status", property="applyStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="password_time", property="passwordTime", jdbcType=JdbcType.VARCHAR)
    })
    List<ApplyManage> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(applyManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, applyManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, applyManage)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ApplyManage record) {
        return insert(SqlBuilder.insert(record)
                .into(applyManage)
                //.map(id).toProperty("id")
                .map(houseId).toProperty("houseId")
                .map(userName).toProperty("userName")
                .map(houserName).toProperty("houserName")
                .map(applyTime).toProperty("applyTime")
                .map(deviceNum).toProperty("deviceNum")
                .map(applyStatus).toProperty("applyStatus")
                .map(password).toProperty("password")
                .map(passwordTime).toProperty("passwordTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ApplyManage record) {
        return insert(SqlBuilder.insert(record)
                .into(applyManage)
                .map(id).toProperty("id")
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(userName).toPropertyWhenPresent("userName", record::getUserName)
                .map(houserName).toPropertyWhenPresent("houserName", record::getHouserName)
                .map(applyTime).toPropertyWhenPresent("applyTime", record::getApplyTime)
                .map(deviceNum).toPropertyWhenPresent("deviceNum", record::getDeviceNum)
                .map(applyStatus).toPropertyWhenPresent("applyStatus", record::getApplyStatus)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(passwordTime).toPropertyWhenPresent("passwordTime", record::getPasswordTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ApplyManage>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, houseId, userName, houserName, applyTime, deviceNum, applyStatus, password, passwordTime)
                .from(applyManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ApplyManage>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, houseId, userName, houserName, applyTime, deviceNum, applyStatus, password, passwordTime)
                .from(applyManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default ApplyManage selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, houseId, userName, houserName, applyTime, deviceNum, applyStatus, password, passwordTime)
                .from(applyManage)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ApplyManage record) {
        return UpdateDSL.updateWithMapper(this::update, applyManage)
                .set(id).equalTo(record::getId)
                .set(houseId).equalTo(record::getHouseId)
                .set(userName).equalTo(record::getUserName)
                .set(houserName).equalTo(record::getHouserName)
                .set(applyTime).equalTo(record::getApplyTime)
                .set(deviceNum).equalTo(record::getDeviceNum)
                .set(applyStatus).equalTo(record::getApplyStatus)
                .set(password).equalTo(record::getPassword)
                .set(passwordTime).equalTo(record::getPasswordTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ApplyManage record) {
        return UpdateDSL.updateWithMapper(this::update, applyManage)
                .set(id).equalToWhenPresent(record::getId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(houserName).equalToWhenPresent(record::getHouserName)
                .set(applyTime).equalToWhenPresent(record::getApplyTime)
                .set(deviceNum).equalToWhenPresent(record::getDeviceNum)
                .set(applyStatus).equalToWhenPresent(record::getApplyStatus)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(passwordTime).equalToWhenPresent(record::getPasswordTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ApplyManage record) {
        return UpdateDSL.updateWithMapper(this::update, applyManage)
//                .set(houseId).equalTo(record::getHouseId)
//                .set(userName).equalTo(record::getUserName)
//                .set(houserName).equalTo(record::getHouserName)
//                .set(applyTime).equalTo(record::getApplyTime)
//                .set(deviceNum).equalTo(record::getDeviceNum)
                .set(applyStatus).equalTo(record::getApplyStatus)
                .set(password).equalTo(record::getPassword)
                .set(passwordTime).equalTo(record::getPasswordTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ApplyManage record) {
        return UpdateDSL.updateWithMapper(this::update, applyManage)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(houserName).equalToWhenPresent(record::getHouserName)
                .set(applyTime).equalToWhenPresent(record::getApplyTime)
                .set(deviceNum).equalToWhenPresent(record::getDeviceNum)
                .set(applyStatus).equalToWhenPresent(record::getApplyStatus)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(passwordTime).equalToWhenPresent(record::getPasswordTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}