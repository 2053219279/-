package com.example.demo.demos.service.impl;

import com.example.demo.demos.Entity.Deposit;
import com.example.demo.demos.Entity.Product;
import com.example.demo.demos.mapper.DepositMapper;
import com.example.demo.demos.mapper.ProductMapper;
import com.example.demo.demos.mapper.RepertoryMapper;
import com.example.demo.demos.pager.Page;
import com.example.demo.demos.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 10:29
 **/
@Service
public class RepertoryServiceImpl implements RepertoryService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private RepertoryMapper repertoryMapper;
    @Autowired
    private DepositMapper depositMapper;
    @Override
    public Page getRepertoryByPage(String productName, Timestamp timestamp, int current, int pageSize) {
        Deposit deposit = new Deposit();
        deposit.setDepositTime(timestamp);
        deposit.setProductName(productName);
        List<Deposit> depositList = depositMapper.getDeposit(deposit);
        int pageNum = (current-1)*pageSize;
        Page<List<Deposit>> listPage = new Page<List<Deposit>>(current,depositList.size(),pageSize,depositList.subList(pageNum,current*pageSize));
        return listPage;
    }
}
