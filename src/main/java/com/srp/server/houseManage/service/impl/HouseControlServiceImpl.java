package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseControlMapper;
import com.srp.server.houseManage.model.HouseControl;
import com.srp.server.houseManage.service.HouseControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.houseManage.dao.HouseControlDynamicSqlSupport.houseId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
public class HouseControlServiceImpl implements HouseControlService {
    @Autowired
    private HouseControlMapper houseControlMapper;

    @Override
    public List<HouseControl> findAll() {
        return houseControlMapper.selectByExample().build().execute();
    }

    @Override
    public HouseControl findByHouseId(String house_id) {
        List<HouseControl> houseControls = houseControlMapper.selectByExample().where(houseId, isIn(house_id)).build().execute();
        if (houseControls.isEmpty()){
            return null;
        }else {
            return houseControls.get(0);
        }

    }

    @Override
    public HouseControl addHouseControl(HouseControl houseControl) {
        houseControlMapper.insert(houseControl);
        return houseControlMapper.selectByPrimaryKey(houseControl.getId());
    }

    @Override
    public Integer updateHouseControl(HouseControl houseControl) {
        return houseControlMapper.updateByPrimaryKey(houseControl);
    }

    @Override
    public Integer delHouseControl(String house_id) {
        return houseControlMapper.deleteByExample().where(houseId,isIn(house_id)).build().execute();
    }
}
