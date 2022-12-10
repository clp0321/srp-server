package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseControl;

import java.util.List;

public interface HouseControlService {
    /**
     * 查询所有监管信息
     * @return
     */
    List<HouseControl> findAll();

    /**
     *
     * @param house_id
     * @return
     */
    HouseControl findByHouseId(String house_id);

    /**
     * 添加监管信息
     * @param houseControl
     * @return
     */
    HouseControl addHouseControl(HouseControl houseControl);

    /**
     * 更新监管信息
     * @param houseControl
     * @return
     */
    Integer updateHouseControl(HouseControl houseControl);

    /**
     * 根据house_id删除监管信息
     * @param house_id
     * @return
     */
    Integer delHouseControl(String house_id);
}
