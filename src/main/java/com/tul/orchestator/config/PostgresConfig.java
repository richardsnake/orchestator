package com.tul.orchestator.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configuration
public class PostgresConfig {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource  PostgresDataSource(){
        return DataSourceBuilder.create().build();
    }
}
