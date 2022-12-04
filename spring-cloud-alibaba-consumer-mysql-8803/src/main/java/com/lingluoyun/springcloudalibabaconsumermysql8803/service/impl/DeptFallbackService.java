package com.lingluoyun.springcloudalibabaconsumermysql8803.service.impl;

import com.lingluoyun.springcloudalibabaconsumermysql8803.service.DeptFeignService;
import com.lingluoyun.springcloudalibabaprovidermysql8003.entity.CommonResult;
import com.lingluoyun.springcloudalibabaprovidermysql8003.entity.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptFallbackService implements DeptFeignService {
    @Override
    public CommonResult<Dept> get(int id) {
        return null;
    }

    @Override
    public CommonResult<List<Dept>> list() {
        return null;
    }
}
