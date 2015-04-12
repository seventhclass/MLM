package com.milleans.product.services;

import com.milleans.model.Product;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
public interface IProductService {

    public List<Product> getAllProduct();

    public Product save(Product product);

}
