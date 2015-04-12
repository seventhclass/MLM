package com.milleans.product.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Product;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Repository("productDao")
public class ProductDao extends AbstractDao implements IProductDao {
    @Override
    public Product save(Product product) {
        Product pro = (Product) this.getCurrentSession().save(product);
        return pro;
    }

    @Override
    public List<Product> getAllList() {
        Criteria criteria = this.getCurrentSession().createCriteria(Product.class);
        List<Product> list = criteria.list();
        return list;
    }
}
