package com.srp.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            //映射static路径的请求到static目录下
            registry.addResourceHandler("/static/**").addResourceLocations("classpath/static/img/");
            //registry.addResourceHandler("/img/**").addResourceLocations("classpath/static/img/");
    }
}
