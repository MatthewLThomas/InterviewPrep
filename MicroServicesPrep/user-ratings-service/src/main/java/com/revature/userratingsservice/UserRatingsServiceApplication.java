package com.revature.userratingsservice;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@SpringBootApplication
public class UserRatingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRatingsServiceApplication.class, args);
	}
	private ApiInfo apiDetails(){
		return new ApiInfo(
				"NAME",
				"DESCRIPTION",
				"0.1",
				"All Rights Reserved",
				new springfox.documentation.service.Contact(
						"INTERVIEW",
						"revature.com",
						"matthew.thomas@revature.net"),
				"API Licence",
				"",
				Collections.emptyList()
		);
	}

	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.regex("^/(?!error)\\S+"))
				.build()
				.apiInfo(apiDetails());
	}

}
