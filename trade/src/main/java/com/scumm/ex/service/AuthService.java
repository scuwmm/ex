package com.scumm.ex.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
//服务提供者提供的服务名称，即 application.name
@FeignClient(value = "auth") //大小写敏感？
public interface AuthService {

    @GetMapping(value = "/auth/a")
    public String auth();
}
