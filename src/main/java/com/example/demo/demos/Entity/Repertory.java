package com.example.demo.demos.Entity;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 09:30
 **/

public class Repertory {
    private Integer repertoryId;
    private Integer productId;
    private String productName;
    private Integer number;
    private String store;
    private BigDecimal productPrice;

    public Repertory(Integer repertoryId, Integer productId, String productName, Integer number, String store, BigDecimal productPrice) {
        this.repertoryId = repertoryId;
        this.productId = productId;
        this.productName = productName;
        this.number = number;
        this.store = store;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getRepertoryId() {
        return repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Repertory() {
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

}
