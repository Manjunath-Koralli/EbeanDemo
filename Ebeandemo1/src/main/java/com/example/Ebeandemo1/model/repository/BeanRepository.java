package com.example.Ebeandemo1.model.repository;

import io.ebean.EbeanServer;

public abstract class BeanRepository<I,T> extends BeanFinder<I,T> {

	public BeanRepository(Class<T> type, EbeanServer server) {
		super(type, server);
		// TODO Auto-generated constructor stub
	}
	
	public void save(T bean) {
		db().save(bean);
	}
	
	public void update(T bean) {
		db().update(bean);
	}
	
	public void insert(T bean) {
		db().insert(bean);
	}
	
	public boolean delete(T bean) {
		return db().delete(bean);
	}

}
