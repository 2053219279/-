package com.example.demo.demos.service.impl;

import com.example.demo.demos.Entity.Product;
import com.example.demo.demos.mapper.ProductMapper;
import com.example.demo.demos.pager.Page;
import com.example.demo.demos.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-25 22:11
 **/
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Page<List<Product>> getProductByPage(int pageNum, int pageSize, Product product) {
        List<Product> productList = productMapper.getProduct(product);
        int current = (pageNum-1)*pageSize;
        Page<List<Product>> page = new Page(current,productList.size(),pageSize,productList.subList(current,pageNum*pageSize));
        return page;
    }
    @Override
    public List<Product> getProduct() {
        List<Product> productList = productMapper.getProduct();
        return productList;
    }

    @Override
    public int updateProduct(Product product) {
        int i = productMapper.updateProduct(product);
        return i;
    }

    @Override
    public int insertProduct(Product product) {
        int i = productMapper.insertProduct(product);
        return i;
    }

    @Override
    public int deleteProduct(Product product) {
        int i = productMapper.deleteProduct(product.getProductId());
        return i;
    }
}
