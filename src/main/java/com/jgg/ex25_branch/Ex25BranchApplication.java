package com.jgg.ex25_branch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jgg.ex25_branch.mapper") 
public class Ex25BranchApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ex25BranchApplication.class, args);
    }
}
