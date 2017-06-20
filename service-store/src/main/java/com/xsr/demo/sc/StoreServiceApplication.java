package com.xsr.demo.sc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 145811 on 2017/6/20.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class StoreServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StoreServiceApplication.class).web(true).run(args);
    }
}
