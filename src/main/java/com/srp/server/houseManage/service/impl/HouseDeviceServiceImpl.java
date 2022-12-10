package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseDeviceMapper;
import com.srp.server.houseManage.model.HouseDevice;
import com.srp.server.houseManage.model.HousePic;
import com.srp.server.houseManage.service.HouseDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.houseManage.dao.HousePicDynamicSqlSupport.houseId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
public class HouseDeviceServiceImpl implements HouseDeviceService {
    @Autowired
    private HouseDeviceMapper houseDeviceMapper;

    @Override
    public Integer addDevicebyHouseID(HouseDevice houseDevice) {
        return houseDeviceMapper.insert(houseDevice);
    }

    @Override
    public Integer updateDevice(HouseDevice houseDevice) {
        return houseDeviceMapper.updateByPrimaryKey(houseDevice);
    }

    @Override
    public List<HouseDevice> findDeviceByHouseID(String house_id) {
        List<HouseDevice> houseDevices = houseDeviceMapper.selectByExample()
                .where(houseId, isIn(house_id)).build().execute();
        if (houseDevices.isEmpty()){
            return null;
        }
        return houseDevices;
    }

    @Override
    public Integer delDevice(String device_id) {
        return houseDeviceMapper.deleteByPrimaryKey(device_id);
    }
}
