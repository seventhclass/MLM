package com.milleans.service;

public interface ICrud {

    public void save(Object object);

    public void remove(Object object);

    public void update(Object object);

    public Object getItemById(String id);
}
