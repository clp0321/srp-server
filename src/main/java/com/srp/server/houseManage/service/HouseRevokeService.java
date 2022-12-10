package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseRevoke;

import java.util.List;

public interface HouseRevokeService {
    /**
     * 查询所有撤销请求
     *
     * @return
     */
    List<HouseRevoke> findAll();

    /**
     * 根据房源id查询撤销请求
     *
     * @param house_id
     * @return
     */
    HouseRevoke findByHouseId(String house_id);

    /**
     * 添加房源撤销请求
     *
     * @param houseRevoke
     * @return
     */
    Integer addHouseRevoke(HouseRevoke houseRevoke);

    /**
     * 根据house_id删除房源撤销请求
     *
     * @param house_id
     * @return
     */
    Integer delHouseRevokeById(String house_id);

    /**
     * 更新房源撤销请求信息
     *
     * @param houseRevoke
     * @return
     */
    Integer updateHouseRevoke(HouseRevoke houseRevoke);
}
