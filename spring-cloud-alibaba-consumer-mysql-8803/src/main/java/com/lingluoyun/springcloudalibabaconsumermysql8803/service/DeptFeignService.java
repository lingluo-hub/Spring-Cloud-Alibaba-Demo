package com.lingluoyun.springcloudalibabaconsumermysql8803.service;

import com.lingluoyun.springcloudalibabaconsumermysql8803.service.impl.DeptFallbackService;
import com.lingluoyun.springcloudalibabaprovidermysql8003.entity.CommonResult;
import com.lingluoyun.springcloudalibabaprovidermysql8003.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient(value = "${service-url.nacos-user-service}", fallback = DeptFallbackService.class)
public interface DeptFeignService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public CommonResult<Dept> get(@PathVariable("id") int id);
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public CommonResult<List<Dept>> list();
}
