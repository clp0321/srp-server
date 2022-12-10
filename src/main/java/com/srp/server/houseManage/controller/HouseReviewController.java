//package com.srp.server.houseManage.controller;
//
//import com.srp.server.config.data.Response;
//import com.srp.server.config.data.ResultGenerator;
//import com.srp.server.houseManage.model.HouseReview;
//import com.srp.server.houseManage.service.HouseReviewService;
//import com.srp.server.utils.FileUtils;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.ResourceUtils;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.UUID;
//
//@Slf4j
//@Api(tags = "房源审核管理")
//@RestController
//@RequestMapping("/houseReview")
//public class HouseReviewController {
//
//    @Autowired
//    private HouseReviewService houseReviewService;
//
//    @ApiOperation(value = "根据房源ID查询审核信息",notes = "根据房源ID查询审核信息", httpMethod = "GET")
//    @GetMapping("/review")
//    public Response<HouseReview> getHouseReviewById(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                                      @RequestParam(value = "house_id")String house_id){
//        return ResultGenerator.genSuccessResult(houseReviewService.findHouseReviewById(house_id));
//    }
//
//    @ApiOperation(value = "根据房源审核ID删除审核信息",notes = "根据房源审核ID删除审核信息", httpMethod = "DELETE")
//    @DeleteMapping("")
//    public Response<Integer> deleteHouseReview(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                                   @RequestParam(value = "house_id")String house_id) throws IOException{
//        //删除本地图片
//        HouseReview houseReview = houseReviewService.findHouseReviewById(house_id);
//        String path= ResourceUtils.getURL("classpath:").getPath();
//        //target\classes\static\img
//        String filePath = path+"/static/img/";
//
//         String delpath1=filePath+houseReview.getCardIndex();
//         File file1=new File(delpath1);
//         if (file1.exists()){
//              file1.delete();
//         }
//        String delpath2=filePath+houseReview.getCertIndex();
//        File file2=new File(delpath2);
//        if (file2.exists()){
//            file2.delete();
//        }
//
//        return ResultGenerator.genSuccessResult(houseReviewService.delHouseReviewById(house_id));
//    }
//
//    @ApiOperation(value = "添加审核信息",notes = "添加审核信息", httpMethod = "POST")
//    @PostMapping("")
//    public Response<String> addHouseReview(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                 @RequestParam(value = "house_id") String house_id,
//                                 @ApiParam(name = "spname", value = "发起人姓名")
//                                 @RequestParam(value = "spname") String spname,
//                                 @ApiParam(name = "wallet", value = "发起人地址")
//                                 @RequestParam(value = "wallet") String wallet,
//                                 @ApiParam(name = "card_num", value = "发起人姓名身份证号")
//                                 @RequestParam(value = "card_num") String card_num,
//                                 @ApiParam(name = "rev_status", value = "状态")
//                                 @RequestParam(value = "rev_status") Integer rev_status,
//                                 @ApiParam(name = "update_by", value = "更新人姓名")
//                                 @RequestParam(value = "update_by") String update_by,
//                                 @ApiParam(name = "hash", value = "记录哈希")
//                                 @RequestParam(value = "hash") String hash,
//                                 @ApiParam(name = "files", value = "文件", required = true)
//                                 @RequestParam(value = "files") MultipartFile[] files) throws IOException {
//        if (files.length == 0) {
//            System.out.println("file is empty");
//        }
//        //获的项目类路径
//        String path= ResourceUtils.getURL("classpath:").getPath();
//        //target\classes\static\img
//        String filePath = path+"/static/img/";
//        List<String> rev_fileName=new ArrayList<String>();
//        for (MultipartFile multipartFile : files) {
//            if (multipartFile.isEmpty()) {
//                return ResultGenerator.genSuccessResult("文件上传失败");
//            }
//            byte[] fileBytes = multipartFile.getBytes();
//            String originalFilename = multipartFile.getOriginalFilename();
//            String uuid = UUID.randomUUID().toString().replace("_", "").toUpperCase();
//            String fileName = uuid + "_" + originalFilename;
//            rev_fileName.add(fileName);
//            FileUtils.uploadFile(fileBytes, filePath, fileName);
//        }
//
//        HouseReview houseReview = new HouseReview();
//        houseReview.setHouseId(house_id);
//        houseReview.setSpname(spname);
//        houseReview.setWallet(wallet);
//        houseReview.setCardNum(card_num);
//        houseReview.setCardIndex(rev_fileName.get(0));
//        houseReview.setCertIndex(rev_fileName.get(1));
//        houseReview.setRevStatus(rev_status);
//        houseReview.setCreateTime(new Date());
//        houseReview.setUpdateBy(update_by);
//        houseReview.setUpdateTime(new Date());
//        houseReview.setHash(hash);
//        houseReviewService.addHouseReview(houseReview);
//        return ResultGenerator.genSuccessResult("success");
//    }
//    @ApiOperation(value = "查询所有房源审核信息",notes = "查询所有房源审核信息", httpMethod = "GET")
//    @PostMapping("/reviews")
//    public Response<List<HouseReview>> findAllHouseReview(){
//        return ResultGenerator.genSuccessResult(houseReviewService.findAll());
//    }
//
//    @ApiOperation(value = "加载审核图片url", notes = "加载审核图片url", httpMethod = "GET")
//    @GetMapping(value = "/url")
//    public Response<List<String>> LodaFilesByHouseId(@ApiParam(name = "house_id", value = "房源id", required = true)
//                                                     @RequestParam(value = "house_id") String house_id) {
//        HouseReview houseReview = houseReviewService.findHouseReviewById(house_id);
//        List<String> url=new ArrayList<String>();
//        url.add("http://localhost:8989/img/"+houseReview.getCardIndex());
//        url.add("http://localhost:8989/img/"+houseReview.getCertIndex());
////            System.out.println(url);
//        return ResultGenerator.genSuccessResult(url);
//    }
//}
