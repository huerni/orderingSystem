package com.noname.demo.controller;

import com.noname.demo.entity.Product;
import com.noname.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService=null;
    @RequestMapping("/findAllPro")
    public List<Product> findAllPro()
    {
        return productService.findAllProduct();
    }
}