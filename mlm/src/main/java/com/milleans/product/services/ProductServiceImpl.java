package com.milleans.product.services;

import com.milleans.model.Product;
import com.milleans.product.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Service("productService")
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;


    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllList();
    }

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }
}
