package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HousePicMapper;
import com.srp.server.houseManage.model.HousePic;
import com.srp.server.houseManage.service.HousePicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.srp.server.houseManage.dao.HousePicDynamicSqlSupport.houseId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
@Service
public class HousePicServiceImpl implements HousePicService {
    @Autowired
    private HousePicMapper housePicMapper;

    @Override
    public List<HousePic> findPicByHouse_Id(String house_id_) {
        List<HousePic> housePic = housePicMapper.selectByExample()
                .where(houseId, isIn(house_id_)).build().execute();
        if (housePic.isEmpty()){
            return null;
        }
        return housePic;
    }

    @Override
    public Integer updateHouse_Pic(HousePic housePic) {
        return housePicMapper.updateByPrimaryKey(housePic);
    }

    @Override
    public Integer addHouse_Pic(HousePic housePic) {
        return housePicMapper.insert(housePic);
    }

    @Override
    public Integer delHouse_PicBy_Id(String house_id) {
        return housePicMapper.deleteByExample().
                where(houseId,isIn(house_id)).build().execute();
    }

    /**
     * 根据house_id 查询图片地址
     * @param house_id
     * @return
     */
    @Override
    public List<String> findHousePicById(String house_id) {
        List<HousePic> housePics = housePicMapper.selectByExample().where(houseId, isIn(house_id)).build().execute();
        List<String> pic_address=new ArrayList<>();
        for (HousePic housePic : housePics) {
            String picMessage = housePic.getPicMessage();
            pic_address.add(picMessage);
        }
        return pic_address;
    }
}
