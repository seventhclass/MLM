package com.milleans.common.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Category;

import java.util.List;

/**
 * Created by LeHu on 2015-04-12.
 */
public interface ICategoryDao extends IDao {
    public List<Category> getAllCategory();

//    public Category save(Category category);
//
//    public boolean getItemById(int id);
//
//    void remove(Category category);
//
//    void update(Category category);
}
