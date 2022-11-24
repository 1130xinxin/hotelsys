package com.etc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.etc.dao")
public class Jiudiansys1Application {

    public static void main(String[] args) {
        SpringApplication.run(Jiudiansys1Application.class, args);
    }

}
