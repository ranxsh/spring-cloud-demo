package com.xsr.demo.web;

import com.xsr.demo.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 145811 on 2017/8/8.
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;
    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}