package com.example.Ebeandemo1.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Ebeandemo1.model.Customer;

import io.ebean.EbeanServer;

@Repository
public class CustomerRepository extends BeanRepository<Long,Customer> {

	@Autowired
	public CustomerRepository(EbeanServer server) {
		super(Customer.class,server);
	}

}
