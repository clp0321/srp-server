package com.srp.server.fisco.bcos;

import com.google.gson.Gson;
import com.srp.server.fisco.bcos.contract.HelloWorld;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.fisco.bcos.web3j.crypto.Credentials;
import org.fisco.bcos.web3j.protocol.Web3j;
import org.fisco.bcos.web3j.tx.gas.StaticGasProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@Slf4j
@Api(tags = "测试智能合约")
@RestController
@RequestMapping("/testContract")
public class TestContractController {


    //    @Autowired
    private Web3j web3j;
    //    @Autowired
    private Credentials credentials;



    @ApiOperation("测试方法")
    @GetMapping("/test")
    public BigInteger test(){
        Gson gson = new Gson();
        BigInteger blockNumber =new BigInteger("0");
        try {
            blockNumber = web3j.getBlockNumber().send().getBlockNumber();
            Object codestr = web3j.getCode("0xfb4bf907c9a64f7b3a0a2afd901fee46b83606ca").send();
            System.out.println(blockNumber);
            System.out.println("合约信息："+gson.toJson(codestr));
            Object peerInfo = web3j.getPeers().send();
            System.out.println("节点信息："+gson.toJson(peerInfo));
        }catch (Exception e){
            e.printStackTrace();
        }
        return blockNumber;
    }

    @ApiOperation("部署HelloWorld智能合约合约,返回合约地址")
    @GetMapping("/deploy")
    public String deployContract(){
        HelloWorld helloWorld = HelloWorld.load("0xfb4bf907c9a64f7b3a0a2afd901fee46b83606ca",web3j,
                credentials,
                new StaticGasProvider(
                        GasConstants.GAS_PRICE, GasConstants.GAS_LIMIT));
        try {
            helloWorld.get().send();
            return helloWorld.getContractAddress();
        }catch (Exception e){
            log.info("合约部署失败");
        }

        return "合约部署失败";
    }

    @ApiOperation("测试调用HelloWorld合约Set")
    @GetMapping("/set")
    public String testContractSet(String contractAddress,String content){
        if (contractAddress == null) return "地址为空";
        HelloWorld helloWorld = HelloWorld.load(contractAddress,web3j,
                credentials,
                new StaticGasProvider(
                        GasConstants.GAS_PRICE, GasConstants.GAS_LIMIT));
        try {
            helloWorld.set(content).send();
        }catch (Exception e){
            log.info("合约调用失败（set）");
            return "合约调用失败（set）";
        }

        return "合约调用成功";
    }

    @ApiOperation("测试调用HelloWorld合约Get")
    @GetMapping("/get")
    public String testContractGet(String contractAddress){
        if (contractAddress == null) return "地址为空";
        HelloWorld helloWorld = HelloWorld.load(contractAddress,web3j,
                credentials,
                new StaticGasProvider(
                        GasConstants.GAS_PRICE, GasConstants.GAS_LIMIT));
        try {
            return helloWorld.get().send();
        }catch (Exception e){
            log.info("合约调用失败（get）");
        }

        return "合约调用失败（get）";
    }

}
