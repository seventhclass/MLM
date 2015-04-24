package com.milleans.product.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Product;
import com.milleans.product.dto.ProductTable;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Repository("productDao")
@Transactional
public class ProductDao extends AbstractDao implements IProductDao {
//    @Override
//    public Product save(Product product) {
//        Product pro = (Product) this.getCurrentSession().save(product);
//        return pro;
//    }

    @Override
    public List<Product> getAllList() {
        Criteria criteria = this.getCurrentSession().createCriteria(Product.class);
        List<Product> list = criteria.list();
        return list;
    }

    @Override
    public List<ProductTable> getProductList(){

        String hql= "select p, ca.name, cu.name from Product as p, Category as ca, Currency as cu " +
                    "where p.categoryId=ca.id and p.currencyId=cu.id";

        org.hibernate.Query query= this.getCurrentSession().createQuery(hql);

        List rl=query.list();

        System.out.println(rl);

        return null;
    }

    @Override
    public Product getItemById(String id) {
        int _id = Integer.valueOf(id);
        Criteria criteria = this.getCurrentSession().createCriteria(Product.class);
        criteria.add(Restrictions.eq("id", _id));

        List<Product> list = criteria.list();

        if (list == null || list.size() == 0) {
            return null;
        } else
            return list.get(0);
    }


    public void test() {
        Criteria criteria = this.getCurrentSession().createCriteria(Product.class);
    }


}
