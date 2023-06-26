package com.example.demo.demos.mapper;

import com.example.demo.demos.Entity.Deposit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepositMapper {
    List<Deposit> getDeposit(Deposit deposit);
    int insertDeposit(Deposit deposit);
}
