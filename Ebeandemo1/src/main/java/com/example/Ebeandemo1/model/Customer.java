package com.example.Ebeandemo1.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import io.ebean.annotation.DbJson;


@Entity
public class Customer extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	@DbJson
	List<Work_Exp> exp;
	
	public Customer(String name) {
		super();
        this.name = name;
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Work_Exp> getExp() {
		return exp;
	}

	public void setExp(List<Work_Exp> exp) {
		this.exp = exp;
	}



//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
}
