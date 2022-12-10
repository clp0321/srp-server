package com.srp.server.houseManage.service;

import com.srp.server.houseManage.model.HouseManage;

import java.util.List;

public interface HouseManageService {
    /**
     * 查询所有
     * @return
     */
    List<HouseManage> findAll();

    /**
     * 根据house_Id查询
     * @return
     */
    HouseManage findByHouseId(String house_id);

    /**
     * 更新房产存证信息
     * @param houseManage
     * @return
     */
    Integer updateMessage(HouseManage houseManage);

    /**
     * 添加房源信息
     * @param houseManage
     * @return
     */
    Integer addMessage(HouseManage houseManage);

    /**
     * 删除房产存证信息
     * @param house_id
     * @return
     */
    Integer delMessage(String house_id);

    /**
     * 条件筛选
     * @param province
     * @param city
     * @param country
     * @param specify
     * @param struct
     * @param low_price
     * @param high_price
     * @return
     */
    List<HouseManage> searchMessageByReq(String province,String city,String country,String specify,String struct,Double low_price,Double high_price);

    /**
     * 根据houseId 插入对应的picUrl
     * @param houseId
     * @param picUrl
     * @return
     */
    List<HouseManage> addPicUrlByHouseId(String houseId,String picUrl);


}
