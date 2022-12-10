package com.srp.server.demandPublish.controller;

import com.srp.server.config.data.Response;
import com.srp.server.config.data.ResultGenerator;
import com.srp.server.demandPublish.model.DemandTenant;
import com.srp.server.demandPublish.service.DemandTenantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Api(tags = "需求发布管理")
@RestController
@RequestMapping("/demand")
public class DemandTenantController {

    @Autowired
    private DemandTenantService demandTenantService;

//    @ApiOperation(value = "获取所有需求信息",notes = "获取所有需求信息", httpMethod = "GET")
//    @GetMapping("/all")
//    public Response<List<DemandTenant>> findAll(){
//        return ResultGenerator.genSuccessResult(demandTenantService.findAll());
//    }
    @ApiOperation(value = "根据用户id获取发布的需求信息",notes = "根据用户id获取发布的需求信息", httpMethod = "GET")
    @GetMapping("")
    public Response<List<DemandTenant>> findByUserId(@ApiParam(name = "user_id", value = "用户id", required = true)
                                                         @RequestParam(value = "user_id")Integer user_id){
        return ResultGenerator.genSuccessResult(demandTenantService.findByUserId(user_id));
    }
    @ApiOperation(value = "修改发布信息",notes = "修改发布信息", httpMethod = "PUT")
    @PutMapping("")
    public Response<Integer> updateDemand(@RequestBody DemandTenant demandTenant){
        if (demandTenant.getUserId() == null){
            return ResultGenerator.genFailResult("UserId()不能为空！");
        }
        return ResultGenerator.genSuccessResult(demandTenantService.updateDemandTenant(demandTenant));
    }
    @ApiOperation(value = "删除发布信息",notes = "删除发布信息", httpMethod = "DELETE")
    @DeleteMapping("")
    public Response<Integer> deleteDemand(@ApiParam(name = "id", value = "id", required = true)
                                            @RequestParam(value = "id")Integer id){
        return ResultGenerator.genSuccessResult(demandTenantService.delDemandTenantp(id));
    }

    @ApiOperation(value = "添加发布信息",notes = "添加发布信息", httpMethod = "POST")
    @PostMapping("")
    public Response<DemandTenant> addDemand(@RequestBody DemandTenant demandTenant){
        return ResultGenerator.genSuccessResult(demandTenantService.addDemandTenant(demandTenant));
    }

}
