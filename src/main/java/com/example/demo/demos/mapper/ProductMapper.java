package com.example.demo.demos.mapper;

import com.example.demo.demos.Entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductMapper {
    List<Product> getProduct();
    List<Product> getProduct(Product product);
    int insertProduct(Product product);
    int updateProduct(Product product);
    int deleteProduct(Integer id);
}
