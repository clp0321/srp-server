package com.srp.server.demandPublish.service;

import com.srp.server.demandPublish.model.DemandTenant;

import java.util.List;

public interface DemandTenantService {
    /**
     * 发布需求
     * @param demandTenant
     * @return
     */
    Integer addDemandTenant(DemandTenant demandTenant);

    /**
     * 更新需求
     * @param demandTenant
     * @return
     */
    Integer updateDemandTenant(DemandTenant demandTenant);

    /**
     * 删除需求
     * @param id
     * @return
     */
    Integer delDemandTenantp(Integer id);

    /**
     * 查询所有租客需求
     * @return
     */
    List<DemandTenant> findAll();

    /**
     * 根据用户id查询发布的需求
     * @param user_id
     * @return
     */
    List<DemandTenant> findByUserId(Integer user_id);

}
