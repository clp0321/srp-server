package com.srp.server.houseManage.controller;

import com.srp.server.config.data.Response;
import com.srp.server.config.data.ResultGenerator;
import com.srp.server.houseManage.model.HouseManage;
import com.srp.server.houseManage.service.HouseManageService;
import com.srp.server.houseManage.service.HousePicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@Api(tags = "房源管理")
@RestController
@RequestMapping("/houseManage")
public class HouseManageController {
    @Autowired
    private HouseManageService houseManageService;

    @Autowired
    private HousePicService housePicService;

    @ApiOperation(value = "根据房源ID查询房源信息",notes = "根据房源ID查询房源信息", httpMethod = "GET")
    @GetMapping("")
    public Response<HouseManage> getManageById(@ApiParam(name = "house_id", value = "房源id", required = true)
                                               @RequestParam(value = "house_id")String house_id){
        return ResultGenerator.genSuccessResult(houseManageService.findByHouseId(house_id));
    }
    @ApiOperation(value = "查询所有房源信息",notes = "查询所有房源信息", httpMethod = "GET")
    @GetMapping("/houseManages")
    public Response<List<HouseManage>> findAll(){

        return ResultGenerator.genSuccessResult(houseManageService.findAll());
    }

    @ApiOperation(value = "更新房源信息",notes = "更新房源信息", httpMethod = "PUT")
    @PutMapping("")
    public Response<Integer> updateHouseManage(@RequestBody HouseManage houseManage){
        if (houseManage.getHouseId() == null){
            return ResultGenerator.genFailResult("HouseId()不能为空！");
        }
        houseManage.setUpdateTime(new Date());
        return ResultGenerator.genSuccessResult(houseManageService.updateMessage(houseManage));
    }

    @ApiOperation(value = "根据房源ID删除房源信息",notes = "根据房源ID删除房源信息", httpMethod = "DELETE")
    @DeleteMapping("")
    public Response<Integer> deleteHouseByID(String house_id){
        return ResultGenerator.genSuccessResult(houseManageService.delMessage(house_id));
    }

    @ApiOperation(value = "添加房源信息",notes = "添加房源信息", httpMethod = "POST")
    @PostMapping("")
    public Response<HouseManage> addHourseManager(@RequestBody HouseManage houseManage){
        houseManage.setUpdateTime(new Date());
        return ResultGenerator.genSuccessResult(houseManageService.addMessage(houseManage));
    }

    //String province_, String city_, String country_, String specify_, String struct_, Double price_

    @ApiOperation(value = "根据搜索条件查询房源信息",notes = "根据搜索条件查询房源信息", httpMethod = "GET")
    @GetMapping("/choice")
    public Response<List<HouseManage>> getManageByChoice(@ApiParam(name = "province", value = "省",required = true)
                                                   @RequestParam(value = "province") String province,
                                                   @ApiParam(name = "city", value = "市")
                                                   @RequestParam(value = "city" ,required = false)String city,
                                                   @ApiParam(name = "country", value = "区")
                                                   @RequestParam(value = "country",required = false)String country,
                                                   @ApiParam(name = "specify", value = "房屋类型")
                                                   @RequestParam(value = "specify" ,required = false)String specify,
                                                   @ApiParam(name = "struct", value = "结构")
                                                   @RequestParam(value = "struct",required = false)String struct,
                                                   @ApiParam(name = "lowPrice", value = "低价")
                                                   @RequestParam(value = "lowPrice",required = false)Double lowPrice,
                                                         @ApiParam(name = "highPrice", value = "高价")
                                                             @RequestParam(value = "highPrice",required = false)Double highPrice
    ){
        return ResultGenerator.genSuccessResult(houseManageService.searchMessageByReq(province,city,country,specify,struct,lowPrice,highPrice));
    }

}
