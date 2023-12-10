package com.itheima;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@Slf4j
@ServletComponentScan
@EnableCaching
public class cacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(cacheApplication.class,args);
        log.info("启动成功....");
    }
}
