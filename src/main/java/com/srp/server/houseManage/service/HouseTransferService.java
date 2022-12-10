package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseTransfer;
import java.util.List;

public interface HouseTransferService {
    /**
     * 查询所有转移请求
     * @return
     */
    List<HouseTransfer> findAll();

    /**
     * 根据房产id 查询转移请求
     * @param house_id
     * @return
     */
    HouseTransfer findByHouseId(String house_id);

    /**
     * 更新转移请求
     * @param houseTransfer
     * @return
     */
    Integer upadteHouseTransfer(HouseTransfer houseTransfer);

    /**
     * 根据房产id 删除转移请求
     * @param house_id
     * @return
     */
    Integer delHouseTransferById(String house_id);

    /**
     * 新增房产转移请求
     * @param houseTransfer
     * @return
     */
    Integer addHouseTransfer(HouseTransfer houseTransfer);
}
