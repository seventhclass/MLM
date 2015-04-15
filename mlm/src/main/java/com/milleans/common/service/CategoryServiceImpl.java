package com.milleans.common.service;

import com.milleans.common.dao.ICategoryDao;
import com.milleans.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    @Transactional
    public List<Category> getAllCategory() {
        List<Category> rs = categoryDao.getAllCategory();
        return rs;
    }

    @Override
    @Transactional
    public void save(Object object) {
       categoryDao.save(object);
    }

    @Override
    @Transactional
    public void remove(Object object) {
        categoryDao.remove(object);
    }

    @Override
    @Transactional
    public void update(Object object) {
        categoryDao.update(object);
    }

    @Override
    @Transactional
    public Object getItemById(String id) {
        return null;
    }

//    @Override
//    public int save(Category category) {
//        Category _category = categoryDao.save(category);
//        return _category == null ? -1 : 0;
//    }
//
//    @Override
//    public void remove(Category category) {
//        categoryDao.remove(category);
//    }
//
//    @Override
//    public void update(Category category) {
//        categoryDao.update(category);
//    }
}
