package com.srp.server.houseManage.dao;

import com.srp.server.houseManage.model.HousePic;
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

import static com.srp.server.houseManage.dao.HousePicDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface HousePicMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<HousePic> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HousePicResult")
    HousePic selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HousePicResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic_message", property="picMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<HousePic> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(housePic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, housePic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, housePic)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HousePic record) {
        return insert(SqlBuilder.insert(record)
                .into(housePic)
//                .map(id).toProperty("id")
                .map(houseId).toProperty("houseId")
                .map(picMessage).toProperty("picMessage")
                .map(createTime).toProperty("createTime")
                .map(username).toProperty("username")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HousePic record) {
        return insert(SqlBuilder.insert(record)
                .into(housePic)
                .map(id).toProperty("id")
                .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
                .map(picMessage).toPropertyWhenPresent("picMessage", record::getPicMessage)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HousePic>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, houseId, picMessage, createTime, username)
                .from(housePic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HousePic>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, houseId, picMessage, createTime, username)
                .from(housePic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HousePic selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, houseId, picMessage, createTime, username)
                .from(housePic)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HousePic record) {
        return UpdateDSL.updateWithMapper(this::update, housePic)
                .set(id).equalTo(record::getId)
                .set(houseId).equalTo(record::getHouseId)
                .set(picMessage).equalTo(record::getPicMessage)
                .set(createTime).equalTo(record::getCreateTime)
                .set(username).equalTo(record::getUsername);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HousePic record) {
        return UpdateDSL.updateWithMapper(this::update, housePic)
                .set(id).equalToWhenPresent(record::getId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(picMessage).equalToWhenPresent(record::getPicMessage)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(username).equalToWhenPresent(record::getUsername);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HousePic record) {
        return UpdateDSL.updateWithMapper(this::update, housePic)
                .set(houseId).equalTo(record::getHouseId)
                .set(picMessage).equalTo(record::getPicMessage)
                .set(createTime).equalTo(record::getCreateTime)
                .set(username).equalTo(record::getUsername)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HousePic record) {
        return UpdateDSL.updateWithMapper(this::update, housePic)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(picMessage).equalToWhenPresent(record::getPicMessage)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(username).equalToWhenPresent(record::getUsername)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}