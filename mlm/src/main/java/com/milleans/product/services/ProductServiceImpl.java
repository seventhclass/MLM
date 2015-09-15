package com.milleans.product.services;

import com.milleans.model.Product;
import com.milleans.product.dao.IProductDao;
import com.milleans.product.dto.ProductTable;
import com.milleans.shopping.dto.CartContent;
import com.milleans.tools.Constant;
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
        return productDao.getAllList();
    }

    @Override
    public List<ProductTable> getProduct(String accountType) {
        //List<ProductTable> tmp = new ArrayList<ProductTable>();
        List<ProductTable> list = productDao.getProductList();
        if (Constant.PriceStrategy.get(accountType).equals(Constant.RetailerPrice)) {
            for (ProductTable e : list) {
                e.setMatchPrice(e.getRetailPrice());
            }
        } else {
            for (ProductTable e : list) {
                e.setMatchPrice(e.getWholesalePrice());
            }
        }
        return list;
    }

    @Override
    public List<ProductTable> getProduct(int pid) {
        List list = productDao.getProductList(pid);
        return list;
    }

    @Override
    public List<CartContent> getProductByCart(String userId) {
        List<CartContent> cartContents = new ArrayList<CartContent>();
        cartContents = productDao.getProductOfCart(userId);
        return cartContents;
    }

    @Override
    public Product getProductById(int productId) {
        Product product = (Product) this.getItemById(String.valueOf(productId));
        return product;
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
