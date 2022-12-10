package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseTransferMapper;
import com.srp.server.houseManage.model.HouseTransfer;
import com.srp.server.houseManage.service.HouseTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.houseManage.dao.HouseTransferDynamicSqlSupport.houseId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
public class HouseTransferServiceImpl implements HouseTransferService {
    @Autowired
    private HouseTransferMapper houseTransferMapper;

    @Override
    public List<HouseTransfer> findAll() {
        return houseTransferMapper.selectByExample().build().execute();
    }

    @Override
    public HouseTransfer findByHouseId(String house_id) {
        List<HouseTransfer> houseTransfers = houseTransferMapper.selectByExample().where(houseId, isIn(house_id)).build().execute();
        if (houseTransfers.isEmpty()){
            return null;
        }else {
            return houseTransfers.get(0);
        }

    }

    @Override
    public Integer upadteHouseTransfer(HouseTransfer houseTransfer) {
        return houseTransferMapper.updateByPrimaryKey(houseTransfer);
    }

    @Override
    public Integer delHouseTransferById(String house_id) {
        return houseTransferMapper.deleteByExample().where(houseId,isIn(house_id)).build().execute();
    }

    @Override
    public Integer addHouseTransfer(HouseTransfer houseTransfer) {
        return houseTransferMapper.insert(houseTransfer);
    }
}
