package com.example.Ebeandemo1.model;


import java.io.Serializable;

import javax.persistence.Entity;


@Entity
public class Address extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cust_id;
	private String addressLine1;
    private String addressLine2;
    private String city;
    
    public Address(long cust_id,String addressLine1, String addressLine2, String city) {		
        super();
        this.cust_id = cust_id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
    }  
    
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
