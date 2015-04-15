package com.milleans.common.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Category;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 2015-04-12.
 */
@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl extends AbstractDao implements ICategoryDao {
    @Override
    public List<Category> getAllCategory() {
        Criteria criteria = this.getCurrentSession().createCriteria(Category.class);
        List<Category> rl = criteria.list();
        return rl;
    }

//    @Override
//    public Category save(Category category) {
//        return null;
//    }

//    @Override
//    public Category save(Category category) {
//    	this.getCurrentSession().save(category);
//       return category;
//    }

//    @Override
//    public boolean getItemById(int id) {
//        Criteria criteria = this.getCurrentSession().createCriteria(Category.class);
//        criteria.add(Restrictions.eq("id", id));
//
//        List<Category> rl = criteria.list();
//
//        if (rl == null || rl.size() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    @Override
//    public void remove(Category category) {
//
//    }
//
//    @Override
//    public void update(Category category) {
//
//    }

//    @Override
//    public void remove(Category category) {
//        this.getCurrentSession().delete(category);
//    }
//
//    @Override
//    public void update(Category category) {
//        this.getCurrentSession().update(category);
//    }

}
