package com.srp.server.houseManage.dao;

import static com.srp.server.houseManage.dao.HouseDeviceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.srp.server.houseManage.model.HouseDevice;
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
public interface HouseDeviceMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HouseDevice> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseDeviceResult")
    HouseDevice selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseDeviceResult", value = {
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_type", property="deviceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_status", property="deviceStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_code", property="deviceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<HouseDevice> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(houseDevice);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseDevice);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String deviceId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseDevice)
                .where(deviceId, isEqualTo(deviceId_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HouseDevice record) {
        return insert(SqlBuilder.insert(record)
                .into(houseDevice)
                .map(deviceId).toProperty("deviceId")
                .map(houseId).toProperty("houseId")
                .map(deviceType).toProperty("deviceType")
                .map(deviceStatus).toProperty("deviceStatus")
                .map(deviceCode).toProperty("deviceCode")
                .map(updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HouseDevice record) {
        return insert(SqlBuilder.insert(record)
                .into(houseDevice)
                .map(deviceId).toPropertyWhenPresent("deviceId", record::getDeviceId)
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(deviceType).toPropertyWhenPresent("deviceType", record::getDeviceType)
                .map(deviceStatus).toPropertyWhenPresent("deviceStatus", record::getDeviceStatus)
                .map(deviceCode).toPropertyWhenPresent("deviceCode", record::getDeviceCode)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseDevice>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, deviceId, houseId, deviceType, deviceStatus, deviceCode, updateTime)
                .from(houseDevice);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseDevice>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, deviceId, houseId, deviceType, deviceStatus, deviceCode, updateTime)
                .from(houseDevice);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HouseDevice selectByPrimaryKey(String deviceId_) {
        return SelectDSL.selectWithMapper(this::selectOne, deviceId, houseId, deviceType, deviceStatus, deviceCode, updateTime)
                .from(houseDevice)
                .where(deviceId, isEqualTo(deviceId_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HouseDevice record) {
        return UpdateDSL.updateWithMapper(this::update, houseDevice)
                .set(deviceId).equalTo(record::getDeviceId)
                .set(houseId).equalTo(record::getHouseId)
                .set(deviceType).equalTo(record::getDeviceType)
                .set(deviceStatus).equalTo(record::getDeviceStatus)
                .set(deviceCode).equalTo(record::getDeviceCode)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HouseDevice record) {
        return UpdateDSL.updateWithMapper(this::update, houseDevice)
                .set(deviceId).equalToWhenPresent(record::getDeviceId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(deviceType).equalToWhenPresent(record::getDeviceType)
                .set(deviceStatus).equalToWhenPresent(record::getDeviceStatus)
                .set(deviceCode).equalToWhenPresent(record::getDeviceCode)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HouseDevice record) {
        return UpdateDSL.updateWithMapper(this::update, houseDevice)
                .set(houseId).equalTo(record::getHouseId)
                .set(deviceType).equalTo(record::getDeviceType)
                .set(deviceStatus).equalTo(record::getDeviceStatus)
                .set(deviceCode).equalTo(record::getDeviceCode)
                .set(updateTime).equalTo(record::getUpdateTime)
                .where(deviceId, isEqualTo(record::getDeviceId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HouseDevice record) {
        return UpdateDSL.updateWithMapper(this::update, houseDevice)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(deviceType).equalToWhenPresent(record::getDeviceType)
                .set(deviceStatus).equalToWhenPresent(record::getDeviceStatus)
                .set(deviceCode).equalToWhenPresent(record::getDeviceCode)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(deviceId, isEqualTo(record::getDeviceId))
                .build()
                .execute();
    }
}