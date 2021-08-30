package com.xunyu.springbootdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.xunyu.*")//用来扫描和发现指定包及其子包中的Entity定义
@SpringBootApplication
public class SpringBootdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootdemo2Application.class, args);
    }

}
