package com.milleans.product.services;

import com.milleans.model.Product;
import com.milleans.product.dao.IProductDao;
import com.milleans.product.dto.ProductTable;
import com.milleans.shopping.dto.CartContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    @Override
    public List<ProductTable> getProduct() {
        List list = productDao.getProductList();
        return list;
    }

    @Override
    public List<CartContent> getProductByCart(String userId) {
        List<CartContent> cartContents = new ArrayList<CartContent>();
        cartContents = productDao.getProductOfCart(userId);
        return cartContents;
    }

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
