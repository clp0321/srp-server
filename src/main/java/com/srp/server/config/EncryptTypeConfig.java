package com.srp.server.config;

import org.fisco.bcos.web3j.crypto.EncryptType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties(prefix = "encrypt-type")
@Profile(value = {"prod","dev"})
public class EncryptTypeConfig {

    private int encryptType;

    @Bean
    public EncryptType getEncryptType() {
        return new EncryptType(encryptType);
    }

    /**
     * @param encryptType the encryptType to set
     */
    public void setEncryptType(int encryptType) {
        this.encryptType = encryptType;
    }
}
