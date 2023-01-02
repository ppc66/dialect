package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wpc.mapper")
public class DialectAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(DialectAdminApplication.class, args);
    }
}
