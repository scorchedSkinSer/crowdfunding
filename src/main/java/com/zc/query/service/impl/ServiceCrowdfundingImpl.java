package com.zc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zc.common.ServerResponse;
import com.zc.mapper.CrowdfundingMapper;
import com.zc.model.Crowdfunding;
import com.zc.model.ParamCrowdfunding;
import com.zc.service.ServiceCrowdfunding;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServiceCrowdfundingImpl implements ServiceCrowdfunding {
    @Resource
    private CrowdfundingMapper   crowdfundingMapper;
    @Override
    public ServerResponse queryCrowdfunding(ParamCrowdfunding paramCrowdfunding) {
        QueryWrapper<Crowdfunding> productQueryWrapper = new QueryWrapper<>();
        if(StringUtils.isNotBlank(paramCrowdfunding.getName())){
            productQueryWrapper.like("crowUserName",paramCrowdfunding.getName());
        }
        Page<Crowdfunding> page = new Page<>(paramCrowdfunding.getCurrentPage(), paramCrowdfunding.getPageSize());
        IPage<Crowdfunding> iPage = crowdfundingMapper.selectPage(page, productQueryWrapper);
        return ServerResponse.success(iPage);
    }
}
