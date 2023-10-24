package com.configserver.configServerName;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean("secretManager")
    public AWSSecretManager secretManager() {
        return x -> x + "awsSecretValue";
    }

}
