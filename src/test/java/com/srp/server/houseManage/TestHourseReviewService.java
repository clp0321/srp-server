package com.srp.server.houseManage;

import com.srp.server.SrpApplication;
import com.srp.server.houseManage.model.HouseReview;
import com.srp.server.houseManage.service.HouseReviewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@ActiveProfiles("xiang")
@SpringBootTest(classes = SrpApplication.class)
public class TestHourseReviewService {
    @Autowired
    private HouseReviewService houseReviewService;

    @Test
    public void testaddHouseRevies(){
        HouseReview houseReview= new HouseReview();
        houseReview.setHouseId("houseid2");
        houseReview.setSpname("xiang");
        houseReview.setWallet("xxxxx");
        houseReview.setCardNum("320722");
        houseReview.setRevStatus(1);
        houseReview.setCreateTime(new Date());
        houseReview.setHash("SdandkjnNKBDSKHBKDBdadDSD");
        houseReviewService.addHouseReview(houseReview);

    }
    @Test
    public void testupdate(){
        HouseReview houseReview= new HouseReview();
        houseReview.setId(2);
        houseReview.setHouseId("houseid2");
        houseReview.setSpname("testupdate");
        houseReview.setWallet("xxxxx");
        houseReview.setCardNum("320722");
        houseReview.setRevStatus(1);
        houseReview.setCreateTime(new Date());
        houseReview.setHash("SdandkjnNKBDSKHBKDBdadDSD");
        houseReviewService.updateHouseReview(houseReview);
    }
    @Test
    public void testdel(){
        houseReviewService.delHouseReviewById("houseid1");
    }
    @Test
    public void testfindAll(){
        List<HouseReview> houseReviews = houseReviewService.findAll();
        for (HouseReview houseReview : houseReviews) {
            System.out.println(houseReview);
        }
    }
    @Test
    public void testfindById(){
        HouseReview houseid1 = houseReviewService.findHouseReviewById("houseid1");
        System.out.println(houseid1);
    }
}
