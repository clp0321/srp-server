package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseRevokeMapper;
import com.srp.server.houseManage.model.HouseRevoke;
import com.srp.server.houseManage.service.HouseRevokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.houseManage.dao.HouseRevokeDynamicSqlSupport.houseId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
public class HouseRevokeServiceImpl implements HouseRevokeService {
    @Autowired
    private HouseRevokeMapper houseRevokeMapper;
    @Override
    public List<HouseRevoke> findAll() {
        return houseRevokeMapper.selectByExample().build().execute();
    }

    @Override
    public HouseRevoke findByHouseId(String house_id) {
        List<HouseRevoke> houseRevokes = houseRevokeMapper.selectByExample().where(houseId, isIn(house_id)).build().execute();
        if (houseRevokes.isEmpty()){
            return null;
        }else {
            return houseRevokes.get(0);
        }

    }

    @Override
    public Integer addHouseRevoke(HouseRevoke houseRevoke) {
        return houseRevokeMapper.insert(houseRevoke);
    }

    @Override
    public Integer delHouseRevokeById(String house_id) {
        return houseRevokeMapper.deleteByExample().where(houseId,isIn(house_id)).build().execute();
    }

    @Override
    public Integer updateHouseRevoke(HouseRevoke houseRevoke) {
        return houseRevokeMapper.updateByPrimaryKey(houseRevoke);
    }
}
