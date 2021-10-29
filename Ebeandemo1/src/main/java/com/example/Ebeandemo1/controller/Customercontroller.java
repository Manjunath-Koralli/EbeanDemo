package com.example.Ebeandemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Ebeandemo1.model.Address;
import com.example.Ebeandemo1.model.Customer;
import com.example.Ebeandemo1.service.CustomerService;

@Controller
public class Customercontroller {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customer", produces = "application/json")
    @ResponseBody
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }
	
	@RequestMapping(value = "/customer/{city}", produces = "application/json")
    @ResponseBody
    public Customer getCustomerByCity(@PathVariable String city) {
        return customerService.getCustomerByCity(city);
    }
	
	
	@PostMapping(value = "/customer", consumes = "application/json")
    @ResponseBody
    public Customer add(@RequestBody Customer customer) {
		//Address address = new Address("5, Wide Street", null, "New York");
		//Customer customer = new Customer("John Wide", address);
        return customerService.save(customer);
    }
}
