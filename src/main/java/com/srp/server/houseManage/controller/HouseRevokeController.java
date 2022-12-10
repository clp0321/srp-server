//package com.srp.server.houseManage.controller;
//
//import com.srp.server.config.data.Response;
//import com.srp.server.config.data.ResultGenerator;
//import com.srp.server.houseManage.model.HouseRevoke;
//import com.srp.server.houseManage.service.HouseRevokeService;
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
//@Api(tags = "房源撤销请求信息")
//@RestController
//@RequestMapping("/houseRevoke")
//public class HouseRevokeController {
//    @Autowired
//    private HouseRevokeService houseRevokeService;
//
//    @ApiOperation(value = "根据房源ID查询撤销请求信息",notes = "根据房源ID查询撤销请求信息", httpMethod = "GET")
//    @GetMapping("")
//    public Response<HouseRevoke> getRevokeById(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                               @RequestParam(value = "house_id")String house_id){
//        return ResultGenerator.genSuccessResult(houseRevokeService.findByHouseId(house_id));
//    }
//    @ApiOperation(value = "查询所有撤销请求信息",notes = "查询所有撤销请求信息", httpMethod = "GET")
//    @GetMapping("/houseRevokes")
//    public Response<List<HouseRevoke>> findAll(){
//        return ResultGenerator.genSuccessResult(houseRevokeService.findAll());
//    }
//
//
//    @ApiOperation(value = "更新撤销请求信息",notes = "更新撤销请求信息", httpMethod = "PUT")
//    @PutMapping("")
//    public Response<Integer> updateHouseRevoke(@RequestBody HouseRevoke houseRevoke){
//        if (houseRevoke.getHouseId() == null){
//            return ResultGenerator.genFailResult("HouseId()不能为空！");
//        }
//        return ResultGenerator.genSuccessResult(houseRevokeService.updateHouseRevoke(houseRevoke));
//    }
//
//    @ApiOperation(value = "根据房源ID删除房产撤销请求信息",notes = "根据房源ID删除房产撤销请求信息", httpMethod = "DELETE")
//    @DeleteMapping("")
//    public Response<Integer> deleteHouseByID(String house_id){
//        return ResultGenerator.genSuccessResult(houseRevokeService.delHouseRevokeById(house_id));
//    }
//
//    @ApiOperation(value = "添加房产撤销请求信息",notes = "添加房产撤销请求信息", httpMethod = "POST")
//    @PostMapping("")
//    public Response<HouseRevoke> addHoursePic(@RequestBody HouseRevoke houseRevoke){
//        return ResultGenerator.genSuccessResult(houseRevokeService.addHouseRevoke(houseRevoke));
//    }
//}
