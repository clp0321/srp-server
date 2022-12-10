package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseManageMapper;
import com.srp.server.houseManage.model.HouseManage;
import com.srp.server.houseManage.service.HouseManageService;
import com.srp.server.houseManage.service.HousePicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.houseManage.dao.HouseManageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class HouseManageServiceImpl implements HouseManageService {
    @Autowired
    private HouseManageMapper houseManageMapper;
    @Autowired
    private HousePicService housePicService;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<HouseManage> findAll() {

        List<HouseManage> houseManages = houseManageMapper.selectByExample().build().execute();
        return houseManages;
    }

    /**
     * 根据house_id查询
     * @param house_id
     * @return
     */
    @Override
    public HouseManage findByHouseId(String house_id) {
        List<HouseManage> houseManage = houseManageMapper.selectByExample().where(houseId, isIn(house_id)).build().execute();
        if (houseManage.isEmpty()){
            return null;
        }
        return houseManage.get(0);
    }

    /**
     * 更新
     * @param houseManage
     * @return
     */
    @Override
    public Integer updateMessage(HouseManage houseManage) {
        return houseManageMapper.updateByPrimaryKey(houseManage);
    }

    /**
     * 添加
     * @param houseManage
     * @return
     */
    @Override
    public Integer addMessage(HouseManage houseManage) {

        String house_id= houseManage.getHouseId();
        //将第一张图片存储到 house_manage
        List<String> pics = housePicService.findHousePicById(house_id);
        String picUrl = pics.get(0);
        houseManage.setPicUrl("http://localhost:8989/img/"+picUrl);

        return houseManageMapper.insert(houseManage);
    }

    /**
     * 删除
     * @param house_id
     * @return
     */
    @Override
    public Integer delMessage(String house_id) {
        return houseManageMapper.deleteByExample().where(houseId,isIn(house_id)).build().execute();
    }

    /**
     *
     * @param province_
     * @param city_
     * @param country_
     * @param specify_
     * @param struct_
     * @param low_price_
     * @param high_price_
     * @return
     */
    @Override
    public List<HouseManage> searchMessageByReq(String province_, String city_, String country_, String specify_, String struct_,Double low_price_,Double high_price_) {
        return houseManageMapper.selectByExample()
                .where(province,isEqualToWhenPresent(province_))
                .and(country,isEqualToWhenPresent(country_))
                .and(specify,isEqualToWhenPresent(specify_))
                .and(struct,isEqualToWhenPresent(struct_))
                .and(price,isBetweenWhenPresent(low_price_).and(high_price_))
                .build().execute();
    }

    /**
     * 根据houseid　插入图片
     * @param houseId_
     * @param picUrl_
     * @return
     */
    @Override
    public List<HouseManage> addPicUrlByHouseId(String houseId_, String picUrl_) {
        List<HouseManage> houseManages = houseManageMapper.selectByExample().where(houseId, isIn(houseId_)).build().execute();
        houseManages.get(0).setPicUrl(picUrl_);
        return houseManages;
    }
}
