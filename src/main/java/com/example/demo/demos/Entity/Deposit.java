package com.example.demo.demos.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 09:28
 **/

public class Deposit {
    private Integer depositId;
    private Integer productId;
    private String productName;
    private Integer number;
    private Timestamp depositTime;
    private String store;
    private BigDecimal productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Deposit(Integer depositId, Integer productId, String productName, Integer number, Timestamp depositTime, String store, BigDecimal productPrice) {
        this.depositId = depositId;
        this.productId = productId;
        this.productName = productName;
        this.number = number;
        this.depositTime = depositTime;
        this.store = store;
        this.productPrice = productPrice;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Deposit() {
    }



    public Integer getDepositId() {
        return depositId;
    }

    public void setDepositId(Integer depositId) {
        this.depositId = depositId;
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

    public Timestamp getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Timestamp depositTime) {
        this.depositTime = depositTime;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
