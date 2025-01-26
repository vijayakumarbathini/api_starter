package com.vbathini.starter.api_starter.helper;

import org.springframework.stereotype.Component;

@Component
public class StatusCheck {

    public String getStatus() {
        System.out.println("Status is OK!");
        return "API is up and running";
    }
}
