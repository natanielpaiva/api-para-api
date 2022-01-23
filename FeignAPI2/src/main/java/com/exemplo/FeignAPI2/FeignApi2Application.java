package com.exemplo.FeignAPI2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignApi2Application.class, args);
	}

}
