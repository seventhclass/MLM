package com.milleans.service;

public interface IManipulateCrud<T> {
	public void save(Object object);

	public void remove(Object object);

	public void update(Object object);

	public T getItembyId(String id);
}
