package com.milleans.common.service;

import com.milleans.service.ICrud;

import java.util.Map;

/**
 * Created by LeHu on 7/14/15 12:32 PM.
 */
public interface IParameterService extends ICrud {

    public String getValue(String name);

    public Map<String, String> getAllValues();


}
