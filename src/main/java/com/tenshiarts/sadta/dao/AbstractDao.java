package com.tenshiarts.sadta.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;


public class AbstractDao<T extends Serializable> {

	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao() {
		super();
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
