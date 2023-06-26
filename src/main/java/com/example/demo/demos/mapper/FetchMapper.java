package com.example.demo.demos.mapper;

import com.example.demo.demos.Entity.Deposit;
import com.example.demo.demos.Entity.Fetch;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchMapper {
    List<Fetch> getFetch();
    int insertFetch(Fetch fetch);
}
