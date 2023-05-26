package com.tul.orchestator.config;

import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
@Data
public class EngineConfig {

    @Bean
    EngineConfigurationConfigurer<SpringProcessEngineConfiguration> processEngineConfigurationEngineConfigurationConfigurer(){
        return engineConfiguration -> {
            engineConfiguration.setAsyncExecutorNumberOfRetries(0);
            engineConfiguration.setAsyncExecutorActivate(true);
        };
    }

}