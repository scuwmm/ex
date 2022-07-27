package com.scumm.ex.controller;

import com.scumm.ex.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TradeController {
    @Resource
    private AuthService authService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/trade/auth")
    public String getPayment() {
        return authService.auth();
    }

}
