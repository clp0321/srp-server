package com.srp.server;

import com.srp.server.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@SpringBootApplication(exclude = {Web3jConfig.class, ServiceConfig.class, GroupChannelConnectionsPropertyConfig.class, EncryptTypeConfig.class, AccountConfig.class})
@EnableConfigurationProperties
public class SrpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrpApplication.class, args);

    }

}
