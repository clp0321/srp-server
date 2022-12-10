//package com.srp.server.houseManage.controller;
//
//import com.srp.server.houseManage.model.HouseRent;
//import com.srp.server.houseManage.service.HouseRentService;
//import com.srp.server.config.data.Response;
//import com.srp.server.config.data.ResultGenerator;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Slf4j
//@Api(tags = "房源信息管理")
//@RestController
//@RequestMapping("/houseMessage")
//public class HouseRentController {
//
//    @Autowired
//    private HouseRentService houseService;
//
//    @ApiOperation(value = "获取所有房源信息",notes = "获取所有房源信息", httpMethod = "GET")
//    @GetMapping("")
//    public Response<List<HouseRent>> getAllHouse(){
//        return ResultGenerator.genSuccessResult(houseService.findAllHouse());
//    }
//
//    @ApiOperation(value = "修改房源信息",notes = "修改房源信息", httpMethod = "PUT")
//    @PutMapping("")
//    public Response<Integer> updateHouse(@RequestBody HouseRent houseRent){
//        if (houseRent.getHouseId() == null){
//            return ResultGenerator.genFailResult("HouseId()不能为空！");
//        }
//        return ResultGenerator.genSuccessResult(houseService.updateHourse(houseRent));
//    }
//    @ApiOperation(value = "删除房源",notes = "删除房源", httpMethod = "DELETE")
//    @DeleteMapping("")
//    public Response<Integer> deleteHouse(String house_id){
//        return ResultGenerator.genSuccessResult(houseService.delHourse(house_id));
//    }
//
//    @ApiOperation(value = "添加房源",notes = "添加房源", httpMethod = "POST")
//    @PostMapping("")
//    public Response<HouseRent> addHourse(@RequestBody HouseRent houseRent){
//        return ResultGenerator.genSuccessResult(houseService.insertHourse(houseRent));
//    }
//
//}
