package com.srp.server.houseManage;

import com.srp.server.SrpApplication;
import com.srp.server.houseManage.model.HouseDevice;
import com.srp.server.houseManage.service.HouseDeviceService;
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
public class TestHouseDeviceService {
    @Autowired
    private HouseDeviceService deviceService;
    @Test
    public void testAdd(){
        HouseDevice houseDevice=new HouseDevice();
        houseDevice.setDeviceId("testadddeviceid3");
        houseDevice.setHouseId("houseid2");
        houseDevice.setDeviceType("电表");
        houseDevice.setDeviceStatus("是");
        houseDevice.setDeviceCode("asdasdaasfa");
        houseDevice.setUpdateTime(new Date());
        deviceService.addDevicebyHouseID(houseDevice);
    }

    @Test
    public void testupdate(){
        HouseDevice houseDevice=new HouseDevice();
        houseDevice.setDeviceId("testadddeviceid2");
        houseDevice.setHouseId("houseid2");
        houseDevice.setDeviceType("水表");
        houseDevice.setDeviceStatus("是");
        houseDevice.setDeviceCode("asdasdaasfa");
        houseDevice.setUpdateTime(new Date());
        deviceService.updateDevice(houseDevice);
    }
    @Test
    public void testfindDevByHouseId(){
        List<HouseDevice> houseDevices = deviceService.findDeviceByHouseID("houseid2");
        for (HouseDevice houseDevice : houseDevices) {
            System.out.println(houseDevice);
        }
    }

    @Test
    public void testDelDevice(){
        deviceService.delDevice("testadddeviceid3");
    }
}
