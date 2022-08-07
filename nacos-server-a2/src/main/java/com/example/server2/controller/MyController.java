package com.example.server2.controller;

import com.example.server2.feignb.FeignBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {

    @Autowired
    private FeignBClient bClient;

    @GetMapping("/version")
    public String version(){
        String path =  "gateway---->访问到service-A的灰度版本[version:2.0]";
        String resultB = bClient.testVersion();
        return path + resultB;
    }

}
