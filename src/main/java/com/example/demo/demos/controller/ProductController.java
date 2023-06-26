package com.example.demo.demos.controller;

import com.example.demo.demos.Entity.Product;
import com.example.demo.demos.pager.Page;
import com.example.demo.demos.service.ProductService;
import com.example.demo.demos.utils.R;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: WarehouseManagementSystem
 * @description:
 * @author: WYF
 * @create: 2023-06-25 22:14
 **/
@RestController()
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/page")
    public R<Page> getPageById(Integer current, Integer pageSize,Product product) {
        Page<List<Product>> productByPage = productService.getProductByPage(current, pageSize, product);
        return R.success(productByPage);
    }
    @GetMapping("/get")
    public R<List<Product>> getProduct(){
        List<Product> product = productService.getProduct();
        return R.success(product);
    }
    @PutMapping("/put")
    public R<String> putProduct(Product product){
        int i = productService.updateProduct(product);
        if (i != 1){
            return R.error("更新失败");
        }
        return R.success("更新成功");
    }
    @PostMapping("/insert")
    public R<String> insertProduct(Product product){
        int i = productService.insertProduct(product);
        if (i != 1){
            return R.error("插入失败");
        }
        return R.success("插入成功");
    }
    @DeleteMapping("/delete")
    public R<String> deleteProduct(Product product){
        int i = productService.deleteProduct(product);
        if (i != 1){
            return R.error("删除失败");
        }
        return R.success("删除成功");
    }
}
