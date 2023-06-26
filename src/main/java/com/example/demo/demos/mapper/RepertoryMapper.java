package com.example.demo.demos.mapper;

import com.example.demo.demos.Entity.Repertory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepertoryMapper {
    List<Repertory> getRepertory();
    Repertory getRepertoryByProductId(Integer productId);
    int getProductNumber(Integer productId,String store);
    int insertRepertory(Repertory repertory);
    int updateRepertory(Repertory repertory);
    int updateRepertoryByNumber(Integer Number);
    int deleteRepertory(Repertory repertory);
}
