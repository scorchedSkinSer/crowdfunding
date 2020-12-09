package com.zc.add.controller;

import com.zc.add.common.ServerResponse;
import com.zc.add.common.UplodeFile;
import com.zc.add.model.Crowdfunding;
import com.zc.add.service.CrowdfundingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("crow")
public class CrowdfundingController {


    @Resource
    private CrowdfundingService crowdfundingService;
    @RequestMapping("toAdd")
    public ServerResponse addCrow(Crowdfunding crowdfunding){
        return crowdfundingService.toAdd(crowdfunding);
    }

    @RequestMapping("uploadFile")
    public ServerResponse uploadFile(MultipartFile file){
        return UplodeFile.importPhoto(file);
    }
}
