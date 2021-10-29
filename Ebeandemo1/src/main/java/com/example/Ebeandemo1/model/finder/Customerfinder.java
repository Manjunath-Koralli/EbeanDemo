package com.example.Ebeandemo1.model.finder;


import com.example.Ebeandemo1.model.Customer;

import io.ebean.Finder;

public class Customerfinder extends Finder<Long,Customer>{

	public Customerfinder() {
	    super(Customer.class);
	}
}
