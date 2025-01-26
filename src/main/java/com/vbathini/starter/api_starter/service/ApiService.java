package com.vbathini.starter.api_starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    private Environment environment;
    public ApiService(Environment environment) {
        this.environment = environment;
    }
    public String getUserDetails() {
        String firstName = environment.getProperty("firstName");
        String lastName = environment.getProperty("lastName");
        return "User Details: First Name: " + firstName + " Last Name: "+ lastName;
    }
}
