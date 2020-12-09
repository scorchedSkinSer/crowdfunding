package com.zc.service;

import com.zc.common.ServerResponse;
import com.zc.model.ParamCrowdfunding;

public interface ServiceCrowdfunding {
    ServerResponse queryCrowdfunding(ParamCrowdfunding paramCrowdfunding);
}
