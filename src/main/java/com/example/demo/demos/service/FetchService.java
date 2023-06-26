package com.example.demo.demos.service;

import com.example.demo.demos.Entity.Fetch;

import java.util.List;

public interface FetchService {
    List<Fetch> getFetch();
    int insertFetch(Fetch fetch);
}
