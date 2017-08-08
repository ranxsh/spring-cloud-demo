package com.xsr.demo.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 145811 on 2017/8/8.
 */
@FeignClient("EUREKA-CLIENT")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}