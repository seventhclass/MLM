package com.milleans.common.dto;

import com.milleans.model.Category;

import java.util.List;

/**
 * Created by LeHu on 2015-04-12.
 */
public class CategoryJs {

    private String result;

    private String message;

    private List<Category> list;

    public List<Category> getList() {
        return list;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
