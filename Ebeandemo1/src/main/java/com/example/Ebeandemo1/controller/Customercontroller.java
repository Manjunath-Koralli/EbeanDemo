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
import com.example.Ebeandemo1.model.Request;
import com.example.Ebeandemo1.service.AddressService;
import com.example.Ebeandemo1.service.CustomerService;
import com.example.Ebeandemo1.utils.CustomObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

@Controller
public class Customercontroller {

	@Autowired
	private CustomObjectMapper customObjectMapper;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	AddressService addressService;
	
	Long custid;
	
	@PostMapping(value = "/customer", consumes = "application/json")
    @ResponseBody
    public Customer add(@RequestBody Request request) {
		System.out.println(request.getCustomer().getExp().toString());
		Customer newCustomer = customerService.save(request.getCustomer());
		System.out.println(newCustomer.getId());
		Address newAdress = 
				addressService.save(new Address(newCustomer.getId(),request.getAddress().getAddressLine1(),request.getAddress().getAddressLine2(),
						request.getAddress().getCity()));
		System.out.println(newAdress.getCust_id());
		return newCustomer;
    }
	
	@RequestMapping(value = "/customer", produces = "application/json")
    @ResponseBody
    public List<Customer> getCustomer() {
		List<Customer> customers = customerService.getCustomer();		
        return customers;
    }
	
	@RequestMapping(value = "/customer/{id}", produces = "application/json")
    @ResponseBody
    public Customer getCustomerById(@PathVariable Long id) {
        Customer cust = customerService.getCustomerByID(id);
        System.out.println(cust);       
        return cust;
    }	
	
	@RequestMapping(value = "/customer/address/{id}", produces = "application/json")
    @ResponseBody
    public Address getAddressById(@PathVariable Long id) {
        Address address = addressService.getAddressByCustId(id);
        return address;
    }
	
	private JsonNode json(Object data) {
		return customObjectMapper.getInstance().valueToTree(data);
	}
	
	
}
