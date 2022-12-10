//package com.srp.server.houseManage.controller;
//
//import com.srp.server.config.data.Response;
//import com.srp.server.config.data.ResultGenerator;
//import com.srp.server.houseManage.model.HouseControl;
//import com.srp.server.houseManage.service.HouseControlService;
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
//@Api(tags = "房源信息监管")
//@RestController
//@RequestMapping("/houseControl")
//public class HouseControlController {
//    @Autowired
//    private HouseControlService houseControlService;
//
//    @ApiOperation(value = "根据房源ID查询监管信息",notes = "根据房源ID查询监管信息", httpMethod = "GET")
//    @GetMapping("")
//    public Response<HouseControl> getTransferById(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                               @RequestParam(value = "house_id")String house_id){
//        return ResultGenerator.genSuccessResult(houseControlService.findByHouseId(house_id));
//    }
//    @ApiOperation(value = "查询所有监管信息",notes = "查询所有监管信息", httpMethod = "GET")
//    @GetMapping("/houseControl")
//    public Response<List<HouseControl>> findAll(){
//        return ResultGenerator.genSuccessResult(houseControlService.findAll());
//    }
//
//
//    @ApiOperation(value = "更新房源监管信息",notes = "更新房源监管信息", httpMethod = "PUT")
//    @PutMapping("")
//    public Response<Integer> updateHouseControl(@RequestBody HouseControl houseControl){
//        if (houseControl.getHouseId() == null){
//            return ResultGenerator.genFailResult("HouseId()不能为空！");
//        }
//        return ResultGenerator.genSuccessResult(houseControlService.updateHouseControl(houseControl));
//    }
//
//    @ApiOperation(value = "根据房源ID删除房源监管信息",notes = "根据房源ID删除房源监管信息", httpMethod = "DELETE")
//    @DeleteMapping("")
//    public Response<Integer> deleteHouseByID(String house_id){
//        return ResultGenerator.genSuccessResult(houseControlService.delHouseControl(house_id));
//    }
//
//    @ApiOperation(value = "添加房源监管信息",notes = "添加房源监管信息", httpMethod = "POST")
//    @PostMapping(value = "",headers = "content-type=application/json")
//    public Response<HouseControl> addHourseControl(@RequestBody HouseControl houseControl){
//        return ResultGenerator.genSuccessResult(houseControlService.addHouseControl(houseControl));
//    }
//}
