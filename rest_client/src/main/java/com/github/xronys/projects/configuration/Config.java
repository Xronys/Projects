package com.github.xronys.projects.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.github.xronys.projects")
public class Config {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
