package com.example.demo.demos.controller;

import com.example.demo.demos.Entity.Deposit;
import com.example.demo.demos.Entity.Fetch;
import com.example.demo.demos.Entity.Repertory;
import com.example.demo.demos.pager.Page;
import com.example.demo.demos.service.DepositService;
import com.example.demo.demos.service.FetchService;
import com.example.demo.demos.service.RepertoryService;
import com.example.demo.demos.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 10:15
 **/
@RestController
@RequestMapping("/repertory")
public class RepertoryController {
    @Autowired
    private DepositService depositService;
    @Autowired
    private FetchService fetchService;
    @Autowired
    private RepertoryService repertoryService;
    @PostMapping("/page")
    public R<Page> getRepertory(String productName, Timestamp timestamp,int current,int pageSize){
        Page repertoryByPage = repertoryService.getRepertoryByPage(productName, timestamp, current, pageSize);
        return R.success(repertoryByPage);
    }
    @PostMapping("/fetch")
    public R<Integer> fetch(Fetch fetch){
        int number = fetchService.insertFetch(fetch);
        return R.success(number);
    }
    @PostMapping("/deposit")
    public R<Integer> deposit(Deposit deposit){
        int number = depositService.insertDeposit(deposit);
        return R.success(number);
    }
}
