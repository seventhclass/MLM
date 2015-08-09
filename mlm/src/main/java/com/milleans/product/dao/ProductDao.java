package com.milleans.product.dao;

import com.milleans.dao.AbstractDao;
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

    @Override
    public List<Product> getAllList() {
        Criteria criteria = this.getCurrentSession().createCriteria(Product.class);
        List<Product> list = criteria.list();
        return list;
    }

    @Override
    public List<ProductTable> getProductList() {

//        String hql = "select p, ca, cu ,b.imageName from  Category as ca, Currency as cu, " +
//                " Product as p left join fetch p.id " +
//                " where p.categoryId=ca.id and p.currencyId=cu.id " +
//                " group by p.id";
//
//        List<ProductTable> lsTable = new ArrayList<>();
//        org.hibernate.Query query = this.getCurrentSession().createQuery(hql);
//
//        List rl = query.list();
//
//        for (Object object : rl) {
//            ProductTable productTable = new ProductTable();
//            Object[] objects = (Object[]) object;
//            Product product = (Product) objects[0];
//            Category category = (Category) objects[1];
//            Currency currency = (Currency) objects[2];
//
//            productTable.setCapsuleNumber(product.getCapsuleNumber());
//            productTable.setCategoryName(category.getName());
//            productTable.setCategoryId(category.getId());
//            productTable.setCurrencyName(currency.getName());
//            productTable.setCurrencySymbol(currency.getSymbol());
//            productTable.setCurrrencyId(currency.getId());
//            productTable.setDate(product.getDate());
//            productTable.setDescription(product.getDescription());
//            productTable.setId(product.getId());
//            productTable.setItemCode(product.getItemCode());
//            productTable.setName(product.getName());
//            productTable.setRetailPrice(product.getRetailPrice());
//            productTable.setVolume(product.getVolume());
//            productTable.setVolume2(product.getVolume2());
//
//            lsTable.add(productTable);
//        }
//
//        return lsTable;

        String sql = "SELECT p.id,p.itemcode,p.name AS 'pname', p.capsulenumber,p.wholesaleprice," +
                "p.retailprice,p.date,p.currencyid " +
                ",p.volume,p.volume2,p.description,p.categoryid, c.name, cu.symbol, a.imagename  " +
                " FROM t_product p left join t_album a on p.id=a.productid, t_category c,t_currency cu "
                +" where p.categoryid=c.id and p.currencyid=cu.id group by p.id;";

        List<ProductTable> listTable = new ArrayList<>();

        Query query = this.getCurrentSession().createSQLQuery(sql);

        List list = query.list();

        for (Object object : list) {
            ProductTable productTable = new ProductTable();
            Object[] objects = (Object[]) object;

            productTable.setId(Integer.valueOf(objects[0].toString()));
            productTable.setItemCode(objects[1].toString());
            productTable.setName(objects[2] == null ? null : objects[2].toString());
            productTable.setCapsuleNumber(Integer.valueOf(objects[3].toString()));
            productTable.setWholesalePrice(Float.valueOf(objects[4].toString()));
            productTable.setRetailPrice(Float.valueOf(objects[5].toString()));
            productTable.setCurrrencyId(Integer.valueOf(objects[7].toString()));
            productTable.setVolume(Integer.valueOf(objects[8].toString()));
            productTable.setVolume2(Integer.valueOf(objects[9].toString()));
            productTable.setDescription(objects[10] != null ? objects[10].toString() : null);
            productTable.setCategoryId(Integer.valueOf(objects[11].toString()));
            productTable.setCategoryName(objects[12].toString());
            productTable.setCurrencySymbol(objects[13].toString());
            productTable.setImageName(objects[14] != null ? objects[14].toString() : null);

            listTable.add(productTable);
        }

        return listTable;

    }

    @Override
    public List<ProductTable> getProductList(int pid) {

        String sql = "SELECT p.id,p.itemcode,p.name AS 'pname', p.capsulenumber,p.wholesaleprice," +
                "p.retailprice,p.date,p.currencyid " +
                ",p.volume,p.volume2,p.description,p.categoryid, c.name, cu.symbol, a.imagename  " +
                " FROM t_product p left join t_album a on p.id=a.productid, t_category c,t_currency cu "
                +" where p.categoryid=c.id " +
                " and p.currencyid=cu.id " +
                " and p.id=" +pid+
                " group by p.id;";


        List<ProductTable> listTable = new ArrayList<>();

        Query query = this.getCurrentSession().createSQLQuery(sql);

        List list = query.list();

        for (Object object : list) {
            ProductTable productTable = new ProductTable();
            Object[] objects = (Object[]) object;

            productTable.setId(Integer.valueOf(objects[0].toString()));
            productTable.setItemCode(objects[1].toString());
            productTable.setName(objects[2] == null ? null : objects[2].toString());
            productTable.setCapsuleNumber(Integer.valueOf(objects[3].toString()));
            productTable.setWholesalePrice(Float.valueOf(objects[4].toString()));
            productTable.setRetailPrice(Float.valueOf(objects[5].toString()));
            productTable.setCurrrencyId(Integer.valueOf(objects[7].toString()));
            productTable.setVolume(Integer.valueOf(objects[8].toString()));
            productTable.setVolume2(Integer.valueOf(objects[9].toString()));
            productTable.setDescription(objects[10] != null ? objects[10].toString() : null);
            productTable.setCategoryId(Integer.valueOf(objects[11].toString()));
            productTable.setCategoryName(objects[12].toString());
            productTable.setCurrencySymbol(objects[13].toString());
            productTable.setImageName(objects[14] != null ? objects[14].toString() : null);

            listTable.add(productTable);
        }

        return listTable;

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

        String sql = "select p.id as productid,al.imagename,p.name,c.quantity,p.wholesaleprice,p.capsulenumber,c.id from  t_user as u, t_shoppingcart as c, t_product as p " +
                " left join t_album al on p.id = al.productid " +
                " where u.userId='" + userId + "' and u.id=c.userid and c.productid=p.id group by p.id";

        List<CartContent> list = new ArrayList<>();

        Query query = this.getCurrentSession().createSQLQuery(sql);

        List rs = query.list();


        for (Object object : rs) {
            CartContent cartContent = new CartContent();
            Object[] objects = (Object[]) object;

            cartContent.setProductId(Integer.valueOf(objects[0].toString()));
            cartContent.setImageName(objects[1] == null ? null : objects[1].toString());
            cartContent.setName(objects[2] == null ? null : objects[2].toString());
            cartContent.setQuantity(objects[3] == null ? 0 : Integer.valueOf(objects[3].toString()));
            cartContent.setWholesalePrice(objects[4] == null ? null : Float.valueOf(objects[4].toString()));
            cartContent.setCapsuleNumber(objects[5] == null ? 0 : Integer.valueOf(objects[5].toString()));
            cartContent.setId(Integer.valueOf(objects[6].toString()));

            list.add(cartContent);
        }

//        List<CartContent> rl = new ArrayList<>();
//        Query query = this.getCurrentSession().createQuery(hql);
//        List ls = query.list();
//
//        for (Object object : ls) {
//            CartContent cartContent = new CartContent();
//
//            Object[] objects = (Object[]) object;
//            Product product = (Product) objects[0];
//            ShoppingCart shoppingCart = (ShoppingCart) objects[1];
//            Album album = (Album) objects[2];
//
//            cartContent.setCapsuleNumber(product.getCapsuleNumber());
//            cartContent.setImageName(album.getImageName());
//            cartContent.setName(product.getName());
//            cartContent.setQuantity(shoppingCart.getQuantity());
//            cartContent.setTransactionPrice(shoppingCart.getTransactionPrice());
//
//            cartContent.setProductId(product.getId());
//        }

        return list;
    }

}
