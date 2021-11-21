package com.example.Ebeandemo1.utils;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Singleton
public class CustomObjectMapperImpl implements CustomObjectMapper{

	private ObjectMapper objectMapper;
	
	@Inject
	public CustomObjectMapperImpl(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
		this.objectMapper.setSerializationInclusion(Include.NON_NULL);
		//this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		this.objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	}
	
	
	@Override
	public ObjectMapper getInstance() {
		// TODO Auto-generated method stub
		return objectMapper;
	}

}
