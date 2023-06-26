package com.example.demo.demos.service;

import com.example.demo.demos.pager.Page;

import java.sql.Timestamp;

public interface RepertoryService {
    Page getRepertoryByPage(String productName, Timestamp timestamp,int current,int pageSize);
}
