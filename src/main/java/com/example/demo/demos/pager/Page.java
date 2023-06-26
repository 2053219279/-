package com.example.demo.demos.pager;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-26 09:00
 **/

public class Page<T> {
    private int current;
    private int total;
    private int pageSize;
    private T data;

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", total=" + total +
                ", pageSize=" + pageSize +
                ", data=" + data +
                '}';
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page(int current, int total, int pageSize, T data) {
        this.current = current;
        this.total = total;
        this.pageSize = pageSize;
        this.data = data;
    }
}
