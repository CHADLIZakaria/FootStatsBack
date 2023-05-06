package com.zchadli05.footStatsBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FootStatsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootStatsBackApplication.class, args);
	}
	
}
