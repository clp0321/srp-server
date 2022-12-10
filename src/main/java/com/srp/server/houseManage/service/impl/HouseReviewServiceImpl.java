package com.srp.server.houseManage.service.impl;

import com.srp.server.houseManage.dao.HouseReviewMapper;
import com.srp.server.houseManage.model.HouseReview;
import com.srp.server.houseManage.service.HouseReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.houseManage.dao.HouseReviewDynamicSqlSupport.houseId;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
@Service
public class HouseReviewServiceImpl implements HouseReviewService {
    @Autowired
    private HouseReviewMapper houseReviewMapper;

    @Override
    public Integer addHouseReview(HouseReview houseReview) {
        return houseReviewMapper.insert(houseReview);
    }

    @Override
    public Integer updateHouseReview(HouseReview houseReview) {
        return houseReviewMapper.updateByPrimaryKey(houseReview);
    }

    @Override
    public Integer delHouseReviewById(String house_id) {
        return houseReviewMapper.deleteByExample().where(houseId,isIn(house_id)).build().execute();
    }

    @Override
    public List<HouseReview> findAll() {
        List<HouseReview> houseReviews = houseReviewMapper.selectByExample().build().execute();
        return houseReviews;
    }

    @Override
    public HouseReview findHouseReviewById(String house_id) {
        List<HouseReview> housereviews = houseReviewMapper.selectByExample().where(houseId, isIn(house_id)).build().execute();
        return housereviews.get(0);
    }
}
