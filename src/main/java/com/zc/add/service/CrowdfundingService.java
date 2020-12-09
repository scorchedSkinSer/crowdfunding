package com.zc.add.service;

import com.zc.add.common.ServerResponse;
import com.zc.add.model.Crowdfunding;

public interface CrowdfundingService {

    ServerResponse toAdd(Crowdfunding crowdfunding);
}
