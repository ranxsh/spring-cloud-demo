package com.xsr.demo.sc.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 145811 on 2017/6/20.
 */
@RestController
public class StoreController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/storePuls" ,method = RequestMethod.GET)
    public String storePuls(@RequestParam Integer goodsId, @RequestParam Integer goodsNum) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/storePuls, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", goodsId:" + goodsId + ", goodsNum:" + goodsNum);
        return "From Service-Store, Result is Ok";
    }
}
