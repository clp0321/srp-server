package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseDevice;

import java.util.List;

public interface HouseDeviceService {
    /**
     * 根据房源ID添加设备
     * @param houseDevice
     * @return
     */
    Integer addDevicebyHouseID(HouseDevice houseDevice);

    /**
     * 更新设备信息
     * @param houseDevice
     * @return
     */
    Integer updateDevice(HouseDevice houseDevice);

    /**
     * 查询设备信息
     * @param house_id
     * @return
     */
    List<HouseDevice> findDeviceByHouseID(String house_id);

    /**
     * 删除设备
     * @param device_id
     * @return
     */
    Integer delDevice(String device_id);
}
