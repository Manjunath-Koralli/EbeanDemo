package com.example.Ebeandemo1.service;

import org.springframework.stereotype.Component;

import io.ebean.config.CurrentUserProvider;

@Component
public class CurrentUser implements CurrentUserProvider {

	@Override
	public Object currentUser() {
		// TODO Auto-generated method stub
		return "test";
	}

	
}
