package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HousePic;

import java.util.List;

public interface HousePicService {
    /**
     * 根据houseid查询pic
     * @param house_id
     * @return
     */
    List<HousePic> findPicByHouse_Id(String house_id);

    /**
     * 更新pic
     * @param housePic
     * @return
     */
    Integer updateHouse_Pic(HousePic housePic);

    /**
     * 添加房源图片信息
     * @param housePic
     * @return
     */
    Integer addHouse_Pic(HousePic housePic);

    /**
     * 删除信息
     * @param house_id
     * @return
     */
    Integer delHouse_PicBy_Id(String house_id);

    /**
     * 根据house_id 查询图片地址
     * @param house_id
     * @return
     */
    List<String> findHousePicById(String house_id);
}
