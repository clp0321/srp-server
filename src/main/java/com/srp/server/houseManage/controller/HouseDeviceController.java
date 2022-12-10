//package com.srp.server.houseManage.controller;
//
//import com.srp.server.config.data.Response;
//import com.srp.server.config.data.ResultGenerator;
//import com.srp.server.houseManage.model.HouseDevice;
//import com.srp.server.houseManage.service.HouseDeviceService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@Slf4j
//@Api(tags = "房源设备管理")
//@RestController
//@RequestMapping("/houseDevice")
//public class HouseDeviceController {
//
//    @Autowired
//    private HouseDeviceService houseDeviceService;
//
//    @ApiOperation(value = "根据房源ID查询设备信息",notes = "根据房源ID查询设备信息", httpMethod = "GET")
//    @GetMapping("")
//    public Response<HouseDevice> getDeviceByHouseId(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                                      @RequestParam(value = "house_id")String house_id){
//        return ResultGenerator.genSuccessResult(houseDeviceService.findDeviceByHouseID(house_id));
//    }
//
//    @ApiOperation(value = "更新房源设备信息",notes = "更新房源设备信息", httpMethod = "PUT")
//    @PutMapping("")
//    public Response<Integer> updateHouseDevice(@RequestBody HouseDevice houseDevice){
//        if (houseDevice.getHouseId() == null){
//            return ResultGenerator.genFailResult("HouseId()不能为空！");
//        }
//        return ResultGenerator.genSuccessResult(houseDeviceService.updateDevice(houseDevice));
//    }
//
//    @ApiOperation(value = "根据设备ID删除设备",notes = "根据设备ID删除设备", httpMethod = "DELETE")
//    @DeleteMapping("")
//    public Response<Integer> deleteDeviceByID(String device_id){
//        return ResultGenerator.genSuccessResult(houseDeviceService.delDevice(device_id));
//    }
//
//    @ApiOperation(value = "添加设备信息",notes = "添加设备信息", httpMethod = "POST")
//    @PostMapping("")
//    public Response<Integer> addHourseDevice(@RequestBody HouseDevice houseDevice){
//        return ResultGenerator.genSuccessResult(houseDeviceService.addDevicebyHouseID(houseDevice));
//    }
//
//}
