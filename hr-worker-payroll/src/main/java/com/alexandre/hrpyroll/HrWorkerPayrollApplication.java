package com.alexandre.hrpyroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrWorkerPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWorkerPayrollApplication.class, args);
	}

}
