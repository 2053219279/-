package com.example.demo.demos.service.impl;

import com.example.demo.demos.Entity.Deposit;
import com.example.demo.demos.Entity.Fetch;
import com.example.demo.demos.Entity.Repertory;
import com.example.demo.demos.ex.CustomException;
import com.example.demo.demos.mapper.FetchMapper;
import com.example.demo.demos.mapper.RepertoryMapper;
import com.example.demo.demos.service.FetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 09:30
 **/
@Service
public class FetchServiceImpl implements FetchService {
    @Autowired
    private FetchMapper fetchMapper;
    @Autowired
    private RepertoryMapper repertoryMapper;
    @Override
    public List<Fetch> getFetch() {
        List<Fetch> fetch = fetchMapper.getFetch();
        return fetch;
    }

    @Override
    @Transactional
    public int insertFetch(Fetch fetch) {
        if (fetch==null){
            throw new CustomException("出库信息不能为空！");
        }
        int i = fetchMapper.insertFetch(fetch);
        if (i!=1){
            throw new CustomException("出库失败！");
        }
        int oldNumber =  repertoryMapper.getProductNumber(fetch.getProductId(),fetch.getStore());
        int newNumber = oldNumber - fetch.getNumber();
        if (newNumber<0){
            throw new CustomException("库存不足");
        }
        int updateRepertoryByNumber = repertoryMapper.updateRepertoryByNumber(newNumber);
        if (updateRepertoryByNumber!=1){
            new CustomException("更新库存异常");
        }
        return newNumber;
    }
}
