package com.tul.orchestator;

import javax.annotation.PostConstruct;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */

@SpringBootApplication(proxyBeanMethods = false)
public class OrchestatorApp 
{
    @Autowired
    private ObjectMapper objectMapper;
    public static void main(String[] args) {
		SpringApplication.run(OrchestatorApp.class, args);
    }
    
    @PostConstruct
	public void setUp() {
	  objectMapper.registerModule(new JavaTimeModule());
	}
}
