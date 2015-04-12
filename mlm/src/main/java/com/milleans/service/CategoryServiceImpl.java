package com.milleans.service;

import com.milleans.dao.ICategoryDao;
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
}
