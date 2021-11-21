package com.example.Ebeandemo1.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Ebeandemo1.model.Address;

import io.ebean.EbeanServer;

@Repository
public class AddressRepository extends BeanRepository<Long,Address> {

	@Autowired
	public AddressRepository(EbeanServer server) {
		super(Address.class,server);
	}

}
