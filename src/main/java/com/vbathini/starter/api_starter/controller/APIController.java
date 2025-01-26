package com.vbathini.starter.api_starter.controller;

import com.vbathini.starter.api_starter.helper.StatusCheck;
import com.vbathini.starter.api_starter.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    private ApiService apiService;
    private StatusCheck statusCheck;
        public APIController(ApiService apiService, StatusCheck statusCheck, ApiService apiService1) {
            this.apiService = apiService1;
            this.statusCheck = statusCheck;
        }

        @GetMapping("/user")
        public String getUser() {
        return apiService.getUserDetails();
        }

        @GetMapping("/status")
        public String getStatus() {
        return statusCheck.getStatus();
        }
}
