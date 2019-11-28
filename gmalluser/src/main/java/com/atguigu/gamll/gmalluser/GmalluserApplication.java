package com.atguigu.gamll.gmalluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.gamll")
public class GmalluserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmalluserApplication.class, args);
    }

}
