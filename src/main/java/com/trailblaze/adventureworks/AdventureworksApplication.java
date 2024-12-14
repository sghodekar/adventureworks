package com.trailblaze.adventureworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AdventureworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdventureworksApplication.class, args);
	}

}
