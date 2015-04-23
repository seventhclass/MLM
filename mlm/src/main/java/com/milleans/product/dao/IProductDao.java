package com.milleans.product.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Product;
import com.milleans.product.dto.ProductTable;

import java.util.*;

/**
 * Created by macbookpro on 2015-04-11.
 */
public interface IProductDao extends IDao{

    public List<Product> getAllList();

    public List<ProductTable> getProductList();

    Product getItemById(String id);
}
