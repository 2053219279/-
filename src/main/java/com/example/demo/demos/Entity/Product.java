package com.example.demo.demos.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-25 21:30
 **/

public class Product {
    private Integer productId;
    private String productName;
    private String specification;
    private BigDecimal price;
    private Timestamp createTime;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", specification='" + specification + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                '}';
    }



    public Product(Integer productId, String productName, String specification, BigDecimal price, Timestamp createTime) {
        this.productId = productId;
        this.productName = productName;
        this.specification = specification;
        this.price = price;
        this.createTime = createTime;
    }

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
