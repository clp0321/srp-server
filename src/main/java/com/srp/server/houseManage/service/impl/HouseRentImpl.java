package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseRentMapper;
import com.srp.server.houseManage.model.HouseRent;
import com.srp.server.houseManage.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseRentImpl implements HouseService {
    @Autowired
    private HouseRentMapper houseRentMapper;

    @Override
    public List<HouseRent> findAllHouse() {
        return houseRentMapper.selectByExample().build().execute();
    }

    @Override
    public Integer insertHourse(HouseRent houseRent) {
        return houseRentMapper.insert(houseRent);
    }

    @Override
    public Integer updateHourse(HouseRent houseRent) {
        return houseRentMapper.updateByPrimaryKey(houseRent);
    }

    @Override
    public Integer delHourse(String house_id_) {
        return houseRentMapper.deleteByPrimaryKey(house_id_);
    }
}
