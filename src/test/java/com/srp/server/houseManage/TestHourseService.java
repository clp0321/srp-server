package com.srp.server.houseManage;

import com.srp.server.houseManage.model.HouseRent;
import com.srp.server.houseManage.service.HouseService;
import com.srp.server.SrpApplication;
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
public class TestHourseService {
    @Autowired
    private HouseService houseService;

    @Test
    public void testfindAll() {
        List<HouseRent> houses = houseService.findAllHouse();
        for (HouseRent house : houses) {
            System.out.println(house);
        }
    }

    @Test
    public void testInsertHourse() {
        HouseRent houseRent =new HouseRent();
        houseRent.setHouseId("houseid2");
        houseRent.setHouseHash("hoursehash2");
        houseRent.setMethod(1);
        houseRent.setPrice(100.00);
        houseRent.setPhone("13977306212");
        houseRent.setUpdateTime(new Date());
        houseRent.setDescription("testInsertHourse2");
        houseRent.setPublisher("xiang");
        houseService.insertHourse(houseRent);
    }
    @Test
    public void testupdate(){
        HouseRent houseRent =new HouseRent();
        houseRent.setHouseId("houseid2");
        houseRent.setHouseHash("update测试");
        houseRent.setMethod(1);
        houseRent.setPrice(100.00);
        houseRent.setPhone("13977306212");
        houseRent.setUpdateTime(new Date());
        houseRent.setDescription("testInsertHourse2");
        houseRent.setPublisher("xiang");
        houseService.updateHourse(houseRent);
    }
    @Test
    public void testdel(){
        houseService.delHourse("11111");
    }
}
