package com.zc.controller;

import com.zc.common.ServerResponse;
import com.zc.model.ParamCrowdfunding;
import com.zc.service.ServiceCrowdfunding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("crowdfunding")
public class CrowdfundingController {

    @Resource
    private ServiceCrowdfunding   serviceCrowdfunding;

    @Resource
    private RestTemplate   restTemplate;

    @RequestMapping("queryCrowdfunding")
    public ServerResponse   queryCrowdfunding(ParamCrowdfunding paramCrowdfunding){
        return    serviceCrowdfunding.queryCrowdfunding(paramCrowdfunding);
    }

    @RequestMapping("test")
    public String   test(ParamCrowdfunding paramCrowdfunding){
        return   restTemplate.getForObject("http://crowdfunding/go/demo1",String.class);
    }



}
