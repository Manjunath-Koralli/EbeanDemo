package com.example.Ebeandemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ebeandemo1.model.Customer;

import io.ebean.EbeanServer;

@Service
public class CustomerService {

	@Autowired
	EbeanServer server;
	
	public Customer save(Customer customer) {
		server.save(customer);
		return customer;		
	}
	
	public List<Customer> getCustomer() {
        return server.find(Customer.class).findList();
    }
	
	public Customer getCustomerByID(Long id) {
		Customer customer = server.find(Customer.class).where().eq("id", id).findOne();
        return customer;
    }
	
	public Customer getCustomerExpyearsByID(Long id) {
		Customer customer = server.find(Customer.class).select("exp").where().eq("id", id).findOne();
        return customer;
    }
}
