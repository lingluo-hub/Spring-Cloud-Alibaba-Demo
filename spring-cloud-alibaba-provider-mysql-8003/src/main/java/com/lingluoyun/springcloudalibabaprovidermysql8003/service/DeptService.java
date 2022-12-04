package com.lingluoyun.springcloudalibabaprovidermysql8003.service;

import com.lingluoyun.springcloudalibabaprovidermysql8003.entity.Dept;

import java.util.List;

public interface DeptService {

    Dept get(Integer deptNo);

    List<Dept> selectAll();
}
