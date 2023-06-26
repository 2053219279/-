package com.example.demo.demos.service;

import com.example.demo.demos.Entity.Deposit;

import java.util.List;

public interface DepositService {
    List<Deposit> getDeposit();
    int insertDeposit(Deposit deposit);
}
