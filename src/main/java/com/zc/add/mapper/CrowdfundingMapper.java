package com.zc.add.mapper;

import com.zc.add.model.Crowdfunding;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
@Mapper
@Repository
public interface CrowdfundingMapper extends BaseMapper<Crowdfunding>{
}
