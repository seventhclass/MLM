package com.milleans.product.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Category;
import com.milleans.model.Currency;
import com.milleans.model.Product;
import com.milleans.product.dto.ProductTable;
import com.milleans.shopping.dto.CartContent;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

        String hql= "select p, ca, cu from Product as p, Category as ca, Currency as cu " +
                    "where p.categoryId=ca.id and p.currencyId=cu.id";

        List<ProductTable> lsTable = new ArrayList<ProductTable>();
        org.hibernate.Query query= this.getCurrentSession().createQuery(hql);

        List rl=query.list();


        for (Object object : rl) {
            ProductTable productTable=new ProductTable();
            Object[] objects=(Object[])object;
            Product product=(Product)objects[0];
            Category category=(Category)objects[1];
            Currency currency=(Currency)objects[2];

            productTable.setCapsuleNumber(product.getCapsuleNumber());
            productTable.setCategoryName(category.getName());
            productTable.setCategoryId(category.getId());
            productTable.setCurrencyName(currency.getName());
            productTable.setCurrencySymbol(currency.getSymbol());
            productTable.setCurrrencyId(currency.getId());
            productTable.setDate(product.getDate());
            productTable.setDescription(product.getDescription());
            productTable.setId(product.getId());
            productTable.setItemCode(product.getItemCode());
            productTable.setName(product.getName());
            productTable.setRetailPrice(product.getRetailPrice());
            productTable.setVolume(product.getVolume());
            productTable.setVolume2(product.getVolume2());

            lsTable.add(productTable);
        }

        return lsTable;
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

    @Override
    public List<CartContent> getProductOfCart(String userId) {

        String hql="select p,c,a.imageName from Product as p, User as u, ShoppingCart c, Album as a where u.userId="
                +userId+" and u.id=c.id and c.productId=p.id and  p.id=(select sp.id from Product as sp,Album as al" +
                " where p.id=al.productId limit 1)";

        List<CartContent> rl = new ArrayList<CartContent>();

        Query query = this.getCurrentSession().createQuery(hql);

        List ls=query.list();

        for (Object object : ls) {
            CartContent cartContent=new CartContent();

            Object[] objects=(Object[])object;
            Product product=(Product)objects[0];

            cartContent.setCapsuleNumber(String.valueOf(product.getCapsuleNumber()));
           // cartContent.setId();
            //cartContent.setCartId();

        }

        return null;
    }


    public void test() {
        Criteria criteria = this.getCurrentSession().createCriteria(Product.class);
    }


}
