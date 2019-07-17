package com.noname.demo.controller;

import com.noname.demo.entity.Customers;
import com.noname.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService=null;
    @RequestMapping("/findAllCus")
    public List<Customers> findAllcus()
    {
        return customerService.findAllCustomer();
    }
    @RequestMapping("/insertCus")
    public int insertCus(@RequestBody Customers customers)
    {
        return customerService.insertCus(customers);
    }
}
