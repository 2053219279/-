package com.example.demo.demos.ex;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-25 22:00
 **/

public class CustomException extends RuntimeException{
    public CustomException(String msg){
        super(msg);
    }
}
