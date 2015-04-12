package com.milleans.dao;

import com.milleans.model.Category;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
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
}
