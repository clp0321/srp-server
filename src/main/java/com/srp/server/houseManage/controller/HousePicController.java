package com.srp.server.houseManage.controller;

import com.srp.server.config.data.Response;
import com.srp.server.config.data.ResultGenerator;
import com.srp.server.houseManage.model.HousePic;
import com.srp.server.houseManage.service.HouseManageService;
import com.srp.server.houseManage.service.HousePicService;
import com.srp.server.utils.FileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Slf4j
@Api(tags = "房源图片管理")
@RestController
@RequestMapping("/housePic")
public class HousePicController {

    @Autowired
    private HousePicService housePicService;

    @Autowired
    private HouseManageService houseManageService;

    @ApiOperation(value = "根据房源ID查询图片信息",notes = "根据房源ID查询图片信息", httpMethod = "GET")
    @GetMapping("")
    public Response<List<HousePic>> getPicById(@ApiParam(name = "house_id", value = "房源id", required = true)
                                                      @RequestParam(value = "house_id")String house_id){
        return ResultGenerator.genSuccessResult(housePicService.findPicByHouse_Id(house_id));
    }


    @ApiOperation(value = "根据房源ID删除房源图片",notes = "根据房源ID删除房源图片", httpMethod = "DELETE")
    @DeleteMapping("")
    public Response<Integer> deleteHouseByID(@ApiParam(name = "house_id", value = "房源id", required = true)
                                                 @RequestParam(value = "house_id")String house_id) throws IOException {
        //删除本地记录
        List<String> housePics = housePicService.findHousePicById(house_id);
        String path= ResourceUtils.getURL("classpath:").getPath();
        //target\classes\static\img
        String filePath = path+"/static/img/";
        for (String housePic : housePics) {
            String delpath=filePath+housePic;
            File file=new File(delpath);
            if (file.exists()){
                file.delete();
            }
        }

        return ResultGenerator.genSuccessResult(housePicService.delHouse_PicBy_Id(house_id));
    }


    @ApiOperation(value = "上传房源图片信息", notes = "上传房源图片信息", httpMethod = "POST")
    @PostMapping(value = "", headers = "content-type=multipart/form-data")
    public Response<String> upLodaFiles(@ApiParam(name = "house_id", value = "房源id", required = true)
                              @RequestParam(value = "house_id") String house_id,
                              @ApiParam(name = "username", value = "创建人")
                              @RequestParam(value = "username") String username,
                              @ApiParam(name = "files", value = "文件", required = true)
                              @RequestParam(value = "files") MultipartFile[] files) throws IOException {
        if (files.length == 0) {
            System.out.println("file is empty");
        }
        //获的项目类路径
        String path= ResourceUtils.getURL("classpath:").getPath();
        //target\classes\static\img
        String filePath = path+"/static/img/";
        for (MultipartFile multipartFile : files) {
            if (multipartFile.isEmpty()) {
                return ResultGenerator.genSuccessResult("文件上传失败");
            }
            byte[] fileBytes = multipartFile.getBytes();
            String originalFilename = multipartFile.getOriginalFilename();
            String uuid = UUID.randomUUID().toString().replace("_", "").toUpperCase();

            String fileName = uuid + "_" + originalFilename;

            HousePic housePic = new HousePic();
            housePic.setHouseId(house_id);
            housePic.setPicMessage(fileName);
            housePic.setUsername(username);
            housePic.setCreateTime(new Date());
            housePicService.addHouse_Pic(housePic);
            FileUtils.uploadFile(fileBytes, filePath, fileName);

        }
//        // 更新house_manage 的picurl 字段
//        HouseManage houseManage = houseManageService.findByHouseId(house_id);
//        List<String> pics = housePicService.findHousePicById(house_id);
//        String picUrl = pics.get(0);
//        houseManage.setPicUrl("http://localhost:8989/img/"+picUrl);
//        houseManageService.updateMessage(houseManage);

        return ResultGenerator.genSuccessResult("success");
    }

    @ApiOperation(value = "加载房源图片url", notes = "加载房源图片url", httpMethod = "GET")
    @GetMapping(value = "/url")
    public Response<List<String>> LodaFilesByHouseId(@ApiParam(name = "house_id", value = "房源id", required = true)
                                                     @RequestParam(value = "house_id") String house_id) {
        List<String> housePics = housePicService.findHousePicById(house_id);
        List<String> url=new ArrayList<String>();
        for (String housePic : housePics) {
            url.add("http://localhost:8989/img/"+housePic);
//            System.out.println(url);
        }
        return ResultGenerator.genSuccessResult(url);
    }
}
