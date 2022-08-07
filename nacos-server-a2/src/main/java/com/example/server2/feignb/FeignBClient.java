package com.example.server2.feignb;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "my-server-b")
public interface FeignBClient {


    /**
     * 灰度版本2.0
     * @return
     */
    @GetMapping("/test/version")
    String testVersion();
}
