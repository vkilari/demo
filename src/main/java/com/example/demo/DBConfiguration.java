package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class DBConfiguration {

    @Bean
    public DBConnection getDBConnection() {
        return new DBConnection();
    }


}
