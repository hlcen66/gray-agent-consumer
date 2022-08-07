package com.example.server1.controller;

import com.example.server1.feignb.FeignBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {

    @Autowired
    private FeignBClient bClient;

    /**
     * 稳定版本1.0
     * @return
     */
    @GetMapping("/version")
    public String version(){

        String path =  "gateway---->访问到service-A的稳定版本[version:1.0]";
        String resultB = bClient.testVersion();
        return path + resultB;
    }

}
