package com.example.Ebeandemo1.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;

@Component
public class EbeanFactoryBean implements FactoryBean<EbeanServer>{

	@Autowired
	CurrentUser currentUser;
	
	@Override
	public EbeanServer getObject() throws Exception {
		// TODO Auto-generated method stub
		ServerConfig config = new ServerConfig();
		config.setName("mysqldatabase");
		config.setCurrentUserProvider(currentUser);
		
		config.loadFromProperties();
		
		return EbeanServerFactory.create(config);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return EbeanServer.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}

}
