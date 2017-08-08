package com.xsr.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 145811 on 2017/8/8.
 */

@RestController
public class DcController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/consumer")
    public String dc() {
//        return restTemplate.getForObject("http://eureka-client/dc", String.class);
        return restTemplate.getForObject("http://localhost/dc", String.class);
    }
}
