package com.srp.server.userManage.dao;

import static com.srp.server.userManage.dao.UserDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.srp.server.userManage.model.UserDetail;
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
public interface UserDetailMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<UserDetail> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserDetailResult")
    UserDetail selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserDetailResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_name", property="addressName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.INTEGER),
        @Result(column="cert_id", property="certId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_hash", property="userHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserDetail> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userDetail)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UserDetail record) {
        return insert(SqlBuilder.insert(record)
                .into(userDetail)
//                .map(id).toProperty("id")
                .map(userName).toProperty("userName")
                .map(password).toProperty("password")
                .map(addressName).toProperty("addressName")
                .map(role).toProperty("role")
                .map(certId).toProperty("certId")
                .map(status).toProperty("status")
                .map(phone).toProperty("phone")
                .map(address).toProperty("address")
                .map(avatar).toProperty("avatar")
                .map(userHash).toProperty("userHash")
                .map(createdTime).toProperty("createdTime")
                .map(updatedTime).toProperty("updatedTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UserDetail record) {
        return insert(SqlBuilder.insert(record)
                .into(userDetail)
                .map(id).toProperty("id")
                .map(userName).toPropertyWhenPresent("userName", record::getUserName)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(addressName).toPropertyWhenPresent("addressName", record::getAddressName)
                .map(role).toPropertyWhenPresent("role", record::getRole)
                .map(certId).toPropertyWhenPresent("certId", record::getCertId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(phone).toPropertyWhenPresent("phone", record::getPhone)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(avatar).toPropertyWhenPresent("avatar", record::getAvatar)
                .map(userHash).toPropertyWhenPresent("userHash", record::getUserHash)
                .map(createdTime).toPropertyWhenPresent("createdTime", record::getCreatedTime)
                .map(updatedTime).toPropertyWhenPresent("updatedTime", record::getUpdatedTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserDetail>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userName, password, addressName, role, certId, status, phone, address, avatar, userHash, createdTime, updatedTime)
                .from(userDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserDetail>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userName, password, addressName, role, certId, status, phone, address, avatar, userHash, createdTime, updatedTime)
                .from(userDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UserDetail selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userName, password, addressName, role, certId, status, phone, address, avatar, userHash, createdTime, updatedTime)
                .from(userDetail)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserDetail record) {
        return UpdateDSL.updateWithMapper(this::update, userDetail)
                .set(id).equalTo(record::getId)
                .set(userName).equalTo(record::getUserName)
                .set(password).equalTo(record::getPassword)
                .set(addressName).equalTo(record::getAddressName)
                .set(role).equalTo(record::getRole)
                .set(certId).equalTo(record::getCertId)
                .set(status).equalTo(record::getStatus)
                .set(phone).equalTo(record::getPhone)
                .set(address).equalTo(record::getAddress)
                .set(avatar).equalTo(record::getAvatar)
                .set(userHash).equalTo(record::getUserHash)
                .set(createdTime).equalTo(record::getCreatedTime)
                .set(updatedTime).equalTo(record::getUpdatedTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserDetail record) {
        return UpdateDSL.updateWithMapper(this::update, userDetail)
                .set(id).equalToWhenPresent(record::getId)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(addressName).equalToWhenPresent(record::getAddressName)
                .set(role).equalToWhenPresent(record::getRole)
                .set(certId).equalToWhenPresent(record::getCertId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(avatar).equalToWhenPresent(record::getAvatar)
                .set(userHash).equalToWhenPresent(record::getUserHash)
                .set(createdTime).equalToWhenPresent(record::getCreatedTime)
                .set(updatedTime).equalToWhenPresent(record::getUpdatedTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UserDetail record) {
        return UpdateDSL.updateWithMapper(this::update, userDetail)
                .set(userName).equalTo(record::getUserName)
                .set(password).equalTo(record::getPassword)
                .set(addressName).equalTo(record::getAddressName)
                .set(role).equalTo(record::getRole)
                .set(certId).equalTo(record::getCertId)
                .set(status).equalTo(record::getStatus)
                .set(phone).equalTo(record::getPhone)
                .set(address).equalTo(record::getAddress)
                .set(avatar).equalTo(record::getAvatar)
                .set(userHash).equalTo(record::getUserHash)
                .set(createdTime).equalTo(record::getCreatedTime)
                .set(updatedTime).equalTo(record::getUpdatedTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UserDetail record) {
        return UpdateDSL.updateWithMapper(this::update, userDetail)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(addressName).equalToWhenPresent(record::getAddressName)
                .set(role).equalToWhenPresent(record::getRole)
                .set(certId).equalToWhenPresent(record::getCertId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(avatar).equalToWhenPresent(record::getAvatar)
                .set(userHash).equalToWhenPresent(record::getUserHash)
                .set(createdTime).equalToWhenPresent(record::getCreatedTime)
                .set(updatedTime).equalToWhenPresent(record::getUpdatedTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}