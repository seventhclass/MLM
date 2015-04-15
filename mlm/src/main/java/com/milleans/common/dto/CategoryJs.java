package com.milleans.common.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Category;

import java.util.List;

/**
 * Created by LeHu on 2015-04-12.
 */
public class CategoryJs extends BaseJs {


    private List<Category> list;

    public List<Category> getList() {
        return list;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }


}
