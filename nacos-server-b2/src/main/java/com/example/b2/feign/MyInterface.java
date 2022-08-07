package com.example.b2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "my-server-b")
public interface MyInterface {

    @GetMapping("/test/version")
    String testVersion();
}
