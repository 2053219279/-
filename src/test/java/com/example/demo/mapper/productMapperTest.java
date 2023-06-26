package com.example.demo.mapper;

import com.example.demo.demos.Entity.Product;
import com.example.demo.demos.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-25 21:36
 **/
@SpringBootTest
public class productMapperTest {
    @Autowired
    private ProductMapper productMapper;
    @Test
    public void testGetProduct(){
        List<Product> productList = productMapper.getProduct(new Product(null,"水",null,null,null));
        System.out.println(productList);
    }
    @Test
    public void testInsertProduct(){
//        Product product = new Product(null,"test1","test1",new BigDecimal(20),new Timestamp(new Date().getTime()));
//        int i = productMapper.insertProduct(product);
    }
}
