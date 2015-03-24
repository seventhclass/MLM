package com.milleans.um.dto;

/**
 * Created by macbookpro on 2015-03-23.
 */
public class JsonResponseDto {

    private Object object;

    private String result;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
