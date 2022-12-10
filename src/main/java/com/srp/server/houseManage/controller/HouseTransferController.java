//package com.srp.server.houseManage.controller;
//
//import com.srp.server.config.data.Response;
//import com.srp.server.config.data.ResultGenerator;
//import com.srp.server.houseManage.model.HouseTransfer;
//import com.srp.server.houseManage.service.HouseTransferService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Slf4j
//@Api(tags = "房源转移请求信息")
//@RestController
//@RequestMapping("/houseTransfer")
//public class HouseTransferController {
//    @Autowired
//    private HouseTransferService houseTransferService;
//
//    @ApiOperation(value = "根据房源ID查询转移请求信息",notes = "根据房源ID查询转移请求信息", httpMethod = "GET")
//    @GetMapping("")
//    public Response<HouseTransfer> getTransferById(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                               @RequestParam(value = "house_id")String house_id){
//        return ResultGenerator.genSuccessResult(houseTransferService.findByHouseId(house_id));
//    }
//    @ApiOperation(value = "查询所有转移请求信息",notes = "查询所有转移请求信息", httpMethod = "GET")
//    @GetMapping("/houseTransfers")
//    public Response<List<HouseTransfer>> findAll(){
//        return ResultGenerator.genSuccessResult(houseTransferService.findAll());
//    }
//
//
//    @ApiOperation(value = "更新转移请求信息",notes = "更新转移请求信息", httpMethod = "PUT")
//    @PutMapping("")
//    public Response<Integer> updateHouseTransfer(@RequestBody HouseTransfer houseTransfer){
//        if (houseTransfer.getHouseId() == null){
//            return ResultGenerator.genFailResult("HouseId()不能为空！");
//        }
//        return ResultGenerator.genSuccessResult(houseTransferService.upadteHouseTransfer(houseTransfer));
//    }
//
//    @ApiOperation(value = "根据房源ID删除房产转移请求信息",notes = "根据房源ID删除房产转移请求信息", httpMethod = "DELETE")
//    @DeleteMapping("")
//    public Response<Integer> deleteHouseByID(String house_id){
//        return ResultGenerator.genSuccessResult(houseTransferService.delHouseTransferById(house_id));
//    }
//
//    @ApiOperation(value = "添加房产转移信息",notes = "添加房产转移信息", httpMethod = "POST")
//    @PostMapping("")
//    public Response<HouseTransfer> addHoursePic(@RequestBody HouseTransfer houseTransfer){
//        return ResultGenerator.genSuccessResult(houseTransferService.addHouseTransfer(houseTransfer));
//    }
//}
