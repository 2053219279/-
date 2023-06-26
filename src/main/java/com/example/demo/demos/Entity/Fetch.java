package com.example.demo.demos.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 09:29
 **/

public class Fetch {
    private Integer fetchId;
    private Integer productId;
    private String productName;
    private Integer number;
    private Timestamp fetchTime;
    private String store;
    private BigDecimal productPrice;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Fetch(Integer fetchId, Integer productId, String productName, Integer number, Timestamp fetchTime, String store, BigDecimal productPrice) {
        this.fetchId = fetchId;
        this.productId = productId;
        this.productName = productName;
        this.number = number;
        this.fetchTime = fetchTime;
        this.store = store;
        this.productPrice = productPrice;
    }

    public Fetch() {
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }


    public Integer getFetchId() {
        return fetchId;
    }

    public void setFetchId(Integer fetchId) {
        this.fetchId = fetchId;
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

    public Timestamp getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(Timestamp fetchTime) {
        this.fetchTime = fetchTime;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
