package com.srp.server.demandPublish.service.impl;

import com.srp.server.demandPublish.dao.DemandTenantMapper;
import com.srp.server.demandPublish.model.DemandTenant;
import com.srp.server.demandPublish.service.DemandTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.demandPublish.dao.DemandTenantDynamicSqlSupport.userId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
@Service
public class DenandTenantServiceImpl implements DemandTenantService {
    @Autowired
    private DemandTenantMapper demandTenantMapper;

    @Override
    public Integer addDemandTenant(DemandTenant demandTenant) {
        return demandTenantMapper.insert(demandTenant);
    }

    @Override
    public Integer updateDemandTenant(DemandTenant demandTenant) {
        return demandTenantMapper.updateByPrimaryKey(demandTenant);
    }

    @Override
    public Integer delDemandTenantp(Integer id) {
        return demandTenantMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<DemandTenant> findAll() {
        return demandTenantMapper.selectByExample().build().execute();
    }

    @Override
    public List<DemandTenant> findByUserId(Integer user_id) {
        return demandTenantMapper.selectByExample().where(userId,isIn(user_id)).build().execute();
    }
}
