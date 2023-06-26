package com.example.demo.demos.service;

import com.example.demo.demos.Entity.Product;
import com.example.demo.demos.pager.Page;

import java.util.List;

public interface ProductService {
    Page<List<Product>> getProductByPage(int pageNum, int pageSize, Product product);
    List<Product> getProduct();
    int updateProduct(Product product);
    int insertProduct(Product product);
    int deleteProduct(Product product);
}
