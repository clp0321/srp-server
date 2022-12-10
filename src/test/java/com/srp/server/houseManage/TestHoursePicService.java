package com.srp.server.houseManage;

import com.srp.server.SrpApplication;
import com.srp.server.houseManage.model.HousePic;
import com.srp.server.houseManage.service.HousePicService;
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
public class TestHoursePicService {
    @Autowired
    private HousePicService housePicService;

    @Test
    public void testaddpic() {
        HousePic housePic=new HousePic();
        housePic.setHouseId("houseid2");
        housePic.setPicMessage("url");
        housePic.setCreateTime(new Date());
        housePic.setUsername("xiang");
        housePicService.addHouse_Pic(housePic);
    }
    @Test
    public void testfindPicByHouse_Id(){
        List<HousePic> houseids = housePicService.findPicByHouse_Id("houseid1");
        for (HousePic houseid : houseids) {
            System.out.println(houseid.getPicMessage());
        }

    }
    @Test
    public void testupdate(){
        HousePic housePic=new HousePic();
        housePic.setId(4);
        housePic.setHouseId("houseid2");
        housePic.setPicMessage("testupdate");
        housePic.setCreateTime(new Date());
        housePic.setUsername("xiang");
        housePicService.updateHouse_Pic(housePic);
    }

    @Test
    public void testdelHouse_PicBy_Id(){
        housePicService.delHouse_PicBy_Id("houseid2");
    }


}
