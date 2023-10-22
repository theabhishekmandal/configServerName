package com.configserver.configServerName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerNameApplication.class, args);
	}

}
