package com.sharding.test.shardingtestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShardingTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingTestDemoApplication.class, args);
		System.out.printf("启动成功");
	}

}
