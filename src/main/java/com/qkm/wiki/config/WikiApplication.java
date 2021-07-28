package com.qkm.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.logging.Logger;

@ComponentScan("com.qkm")
@MapperScan("com.qkm.wiki.mapper")
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiApplication.class, args);
    }

}
