package com.milleans.product.services;

import com.milleans.model.Product;
import com.milleans.service.ICrud;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
public interface IProductService extends ICrud {

    public List<Product> getAllProduct();

}
