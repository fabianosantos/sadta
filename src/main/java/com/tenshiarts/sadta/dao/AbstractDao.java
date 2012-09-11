package com.tenshiarts.sadta.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class AbstractDao<T extends Serializable> extends HibernateDaoSupport {

	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao() {
		super();
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
