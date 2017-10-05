package com.janani.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String index() {

		System.out.println("index");
		return "hi";

	}
}

// @Configuration
// @EnableAutoConfiguration
// @EnableDiscoveryClient
// @EnableConfigServer
// public class ConfigServerApplication {
//
// public static void main(String[] args) {
// SpringApplication.run(ConfigServerApplication.class, args);
// }
//
// }