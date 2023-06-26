package com.example.demo.demos.service.impl;

import com.example.demo.demos.Entity.Deposit;
import com.example.demo.demos.Entity.Repertory;
import com.example.demo.demos.ex.CustomException;
import com.example.demo.demos.mapper.DepositMapper;
import com.example.demo.demos.mapper.RepertoryMapper;
import com.example.demo.demos.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 09:31
 **/
@Service
public class DepositServiceImpl implements DepositService {
    @Autowired
    private DepositMapper depositMapper;
    @Autowired
    private RepertoryMapper repertoryMapper;
    @Override
    public List<Deposit> getDeposit() {
        List<Deposit> deposit = depositMapper.getDeposit(new Deposit());
        return deposit;
    }

    @Override
    @Transactional
    public int insertDeposit(Deposit deposit) {
        if (deposit==null){
            throw new CustomException("入库信息不能为空！");
        }
        int i = depositMapper.insertDeposit(deposit);
        if (i!=1){
            throw new CustomException("入库失败！");
        }
        Repertory repertoryByProductId = repertoryMapper.getRepertoryByProductId(deposit.getDepositId());
        if (repertoryByProductId == null){
            Repertory repertory = new Repertory(null, deposit.getProductId(),deposit.getProductName(), deposit.getNumber(), deposit.getStore(),deposit.getProductPrice());
            int insertRepertory = repertoryMapper.insertRepertory(repertory);
        }
        int oldNumber =  repertoryMapper.getProductNumber(deposit.getProductId(),deposit.getStore());
        int updateRepertoryByNumber = repertoryMapper.updateRepertoryByNumber(oldNumber + deposit.getNumber());
        if (updateRepertoryByNumber!=1){
            throw new CustomException("更新库存异常");
        }
        int newNumber = repertoryMapper.getProductNumber(deposit.getProductId(),deposit.getStore());
        return newNumber;
    }
}
