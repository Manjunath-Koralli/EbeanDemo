package com.example.Ebeandemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ebeandemo1.model.Address;

import io.ebean.EbeanServer;

@Service
public class AddressService {

	@Autowired
	EbeanServer server;
	
	public Address save(Address address) {
		server.save(address);
		return address;		
	}
	
	public List<Address> getAddress() {
        return server.find(Address.class).findList();
		//return server.find(Content.class).findList();
    }
	
	public Address getAddressByCustId(Long id) {
		Address address = server.find(Address.class).where().eq("cust_id", id).findOne();
        return address;
    }
}
