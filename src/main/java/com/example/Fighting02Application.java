package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = {"com.example.mapper"})
public class Fighting02Application {

	public static void main(String[] args) {
		SpringApplication.run(Fighting02Application.class, args);
	}

}
