package com.milleans.common.service;

import com.milleans.model.Category;
import com.milleans.service.ICrud;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
public interface ICategoryService extends ICrud {

    public List<Category> getAllCategory();

//    public int save(Category category);
//
//    void remove(Category category);
//
//    void update(Category category);
}

