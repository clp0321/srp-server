package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseRent;

import java.util.List;

public interface HouseService {
    /**
     * 获取房源信息
     * @return
     */
    List<HouseRent> findAllHouse();

    /**
     * 发布房源信息
     * @param houseRent
     */
    Integer insertHourse(HouseRent houseRent);
    /**
     * 更新房源信息
     * @param houseRent
     */
    Integer updateHourse(HouseRent houseRent);

    /**
     * 撤销房源
     * @param house_id_
     */
    Integer delHourse(String house_id_);


}
