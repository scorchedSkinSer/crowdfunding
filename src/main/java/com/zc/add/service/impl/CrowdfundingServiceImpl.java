package com.zc.add.service.impl;

import com.zc.add.common.ServerResponse;
import com.zc.add.mapper.CrowdfundingMapper;
import com.zc.add.model.Crowdfunding;
import com.zc.add.service.CrowdfundingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class CrowdfundingServiceImpl implements CrowdfundingService {

    @Resource
    private CrowdfundingMapper crowdfundingMapper;


    @Override
    public ServerResponse toAdd(Crowdfunding crowdfunding) {
        crowdfunding.setCrowStartTime(new Date());
        crowdfundingMapper.insert(crowdfunding);
        return ServerResponse.success();
    }
}
