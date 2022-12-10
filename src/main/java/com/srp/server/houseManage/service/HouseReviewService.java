package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseReview;

import java.util.List;

public interface HouseReviewService {
    /**
     * 发布房源审核信息
     * @param houseReview
     * @return
     */
    Integer addHouseReview(HouseReview houseReview);

    /**
     * 更新房源审核信息
     * @param houseReview
     * @return
     */
    Integer updateHouseReview(HouseReview houseReview);

    /**
     * 删除房源审核信息
     * @param house_id
     * @return
     */
    Integer delHouseReviewById(String house_id);


    /**
     * 查询所有房源审核信息
     * @return
     */
    List<HouseReview> findAll();

    /**
     * 根据house_id查询房源审核信息
     * @param house_id
     * @return
     */
    HouseReview findHouseReviewById(String house_id);

}
