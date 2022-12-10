package com.srp.server.houseManage.dao;

import com.srp.server.houseManage.model.HouseManage;
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

import static com.srp.server.houseManage.dao.HouseManageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface HouseManageMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<HouseManage> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseManageResult")
    HouseManage selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseManageResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_owner", property="houseOwner", jdbcType=JdbcType.VARCHAR),
        @Result(column="cert_num", property="certNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.DOUBLE),
        @Result(column="struct", property="struct", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_status", property="houseStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="specify", property="specify", jdbcType=JdbcType.VARCHAR),
        @Result(column="agency", property="agency", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="auth_time", property="authTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="house_hash", property="houseHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.INTEGER),
        @Result(column="payway", property="payway", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="publisher", property="publisher", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic_url", property="picUrl", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseManage> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(houseManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, houseManage)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HouseManage record) {
        return insert(SqlBuilder.insert(record)
                .into(houseManage)
//                .map(id).toProperty("id")
                .map(houseId).toProperty("houseId")
                .map(houseOwner).toProperty("houseOwner")
                .map(certNum).toProperty("certNum")
                .map(size).toProperty("size")
                .map(struct).toProperty("struct")
                .map(province).toProperty("province")
                .map(city).toProperty("city")
                .map(country).toProperty("country")
                .map(position).toProperty("position")
                .map(houseStatus).toProperty("houseStatus")
                .map(specify).toProperty("specify")
                .map(agency).toProperty("agency")
                .map(deviceId).toProperty("deviceId")
                .map(authTime).toProperty("authTime")
                .map(houseHash).toProperty("houseHash")
                .map(method).toProperty("method")
                .map(payway).toProperty("payway")
                .map(price).toProperty("price")
                .map(phone).toProperty("phone")
                .map(updateTime).toProperty("updateTime")
                .map(description).toProperty("description")
                .map(publisher).toProperty("publisher")
                .map(picUrl).toProperty("picUrl")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HouseManage record) {
        return insert(SqlBuilder.insert(record)
                .into(houseManage)
                .map(id).toProperty("id")
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(houseOwner).toPropertyWhenPresent("houseOwner", record::getHouseOwner)
                .map(certNum).toPropertyWhenPresent("certNum", record::getCertNum)
                .map(size).toPropertyWhenPresent("size", record::getSize)
                .map(struct).toPropertyWhenPresent("struct", record::getStruct)
                .map(province).toPropertyWhenPresent("province", record::getProvince)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(country).toPropertyWhenPresent("country", record::getCountry)
                .map(position).toPropertyWhenPresent("position", record::getPosition)
                .map(houseStatus).toPropertyWhenPresent("houseStatus", record::getHouseStatus)
                .map(specify).toPropertyWhenPresent("specify", record::getSpecify)
                .map(agency).toPropertyWhenPresent("agency", record::getAgency)
                .map(deviceId).toPropertyWhenPresent("deviceId", record::getDeviceId)
                .map(authTime).toPropertyWhenPresent("authTime", record::getAuthTime)
                .map(houseHash).toPropertyWhenPresent("houseHash", record::getHouseHash)
                .map(method).toPropertyWhenPresent("method", record::getMethod)
                .map(payway).toPropertyWhenPresent("payway", record::getPayway)
                .map(price).toPropertyWhenPresent("price", record::getPrice)
                .map(phone).toPropertyWhenPresent("phone", record::getPhone)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(publisher).toPropertyWhenPresent("publisher", record::getPublisher)
                .map(picUrl).toPropertyWhenPresent("picUrl", record::getPicUrl)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseManage>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, houseId, houseOwner, certNum, size, struct, province, city, country, position, houseStatus, specify, agency, deviceId, authTime, houseHash, method, payway, price, phone, updateTime, description, publisher, picUrl)
                .from(houseManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HouseManage>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, houseId, houseOwner, certNum, size, struct, province, city, country, position, houseStatus, specify, agency, deviceId, authTime, houseHash, method, payway, price, phone, updateTime, description, publisher, picUrl)
                .from(houseManage);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HouseManage selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, houseId, houseOwner, certNum, size, struct, province, city, country, position, houseStatus, specify, agency, deviceId, authTime, houseHash, method, payway, price, phone, updateTime, description, publisher, picUrl)
                .from(houseManage)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HouseManage record) {
        return UpdateDSL.updateWithMapper(this::update, houseManage)
                .set(id).equalTo(record::getId)
                .set(houseId).equalTo(record::getHouseId)
                .set(houseOwner).equalTo(record::getHouseOwner)
                .set(certNum).equalTo(record::getCertNum)
                .set(size).equalTo(record::getSize)
                .set(struct).equalTo(record::getStruct)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(country).equalTo(record::getCountry)
                .set(position).equalTo(record::getPosition)
                .set(houseStatus).equalTo(record::getHouseStatus)
                .set(specify).equalTo(record::getSpecify)
                .set(agency).equalTo(record::getAgency)
                .set(deviceId).equalTo(record::getDeviceId)
                .set(authTime).equalTo(record::getAuthTime)
                .set(houseHash).equalTo(record::getHouseHash)
                .set(method).equalTo(record::getMethod)
                .set(payway).equalTo(record::getPayway)
                .set(price).equalTo(record::getPrice)
                .set(phone).equalTo(record::getPhone)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(description).equalTo(record::getDescription)
                .set(publisher).equalTo(record::getPublisher)
                .set(picUrl).equalTo(record::getPicUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HouseManage record) {
        return UpdateDSL.updateWithMapper(this::update, houseManage)
                .set(id).equalToWhenPresent(record::getId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(houseOwner).equalToWhenPresent(record::getHouseOwner)
                .set(certNum).equalToWhenPresent(record::getCertNum)
                .set(size).equalToWhenPresent(record::getSize)
                .set(struct).equalToWhenPresent(record::getStruct)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(houseStatus).equalToWhenPresent(record::getHouseStatus)
                .set(specify).equalToWhenPresent(record::getSpecify)
                .set(agency).equalToWhenPresent(record::getAgency)
                .set(deviceId).equalToWhenPresent(record::getDeviceId)
                .set(authTime).equalToWhenPresent(record::getAuthTime)
                .set(houseHash).equalToWhenPresent(record::getHouseHash)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(payway).equalToWhenPresent(record::getPayway)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(publisher).equalToWhenPresent(record::getPublisher)
                .set(picUrl).equalToWhenPresent(record::getPicUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HouseManage record) {
        return UpdateDSL.updateWithMapper(this::update, houseManage)
                .set(houseId).equalTo(record::getHouseId)
                .set(houseOwner).equalTo(record::getHouseOwner)
                .set(certNum).equalTo(record::getCertNum)
                .set(size).equalTo(record::getSize)
                .set(struct).equalTo(record::getStruct)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(country).equalTo(record::getCountry)
                .set(position).equalTo(record::getPosition)
                .set(houseStatus).equalTo(record::getHouseStatus)
                .set(specify).equalTo(record::getSpecify)
                .set(agency).equalTo(record::getAgency)
                .set(deviceId).equalTo(record::getDeviceId)
                .set(authTime).equalTo(record::getAuthTime)
                .set(houseHash).equalTo(record::getHouseHash)
                .set(method).equalTo(record::getMethod)
                .set(payway).equalTo(record::getPayway)
                .set(price).equalTo(record::getPrice)
                .set(phone).equalTo(record::getPhone)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(description).equalTo(record::getDescription)
                .set(publisher).equalTo(record::getPublisher)
                .set(picUrl).equalTo(record::getPicUrl)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HouseManage record) {
        return UpdateDSL.updateWithMapper(this::update, houseManage)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(houseOwner).equalToWhenPresent(record::getHouseOwner)
                .set(certNum).equalToWhenPresent(record::getCertNum)
                .set(size).equalToWhenPresent(record::getSize)
                .set(struct).equalToWhenPresent(record::getStruct)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(houseStatus).equalToWhenPresent(record::getHouseStatus)
                .set(specify).equalToWhenPresent(record::getSpecify)
                .set(agency).equalToWhenPresent(record::getAgency)
                .set(deviceId).equalToWhenPresent(record::getDeviceId)
                .set(authTime).equalToWhenPresent(record::getAuthTime)
                .set(houseHash).equalToWhenPresent(record::getHouseHash)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(payway).equalToWhenPresent(record::getPayway)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(publisher).equalToWhenPresent(record::getPublisher)
                .set(picUrl).equalToWhenPresent(record::getPicUrl)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}