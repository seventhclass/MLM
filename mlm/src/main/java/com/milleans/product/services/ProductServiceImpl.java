package com.milleans.product.services;

import com.milleans.model.Product;
import com.milleans.product.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Service("productService")
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;


    @Override
    @Transactional
    public List<Product> getAllProduct() {
        // List<Product> tmp=productDao.getAllList();
        // List<ProductTable> productTables=new ArrayList<ProductTable>();

        return productDao.getAllList();
    }

//    @Override
//    @Transactional
//    public Product save(Product product) {
//        return productDao.save(product);
//    }

    @Override
    @Transactional
    public void save(Object object) {
        productDao.save(object);
    }

    @Override
    @Transactional
    public void remove(Object object) {
        productDao.remove(object);
    }

    @Override
    @Transactional
    public void update(Object object) {
        productDao.update(object);
    }

    @Override
    @Transactional
    public Object getItemById(String id) {

        return productDao.getItemById(id);

    }
}
