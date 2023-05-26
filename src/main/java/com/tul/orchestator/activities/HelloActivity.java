
package com.tul.orchestator.activities;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

@Component
public class HelloActivity implements JavaDelegate{

    @Autowired
    private ObjectMapper objectMapper;

    public void execute(DelegateExecution execution) {
        System.out.println("Hello Activity here!!!.");
    }

}