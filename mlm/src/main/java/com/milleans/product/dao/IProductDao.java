package com.milleans.product.dao;

import com.milleans.model.Product;

import java.util.*;

/**
 * Created by macbookpro on 2015-04-11.
 */
public interface IProductDao {

    public Product save(Product product);

    public List<Product> getAllList();

}
