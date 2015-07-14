package com.milleans.common.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by LeHu on 7/14/15 12:35 PM.
 */
@Service("parameterService")
@Transactional
public class ParameterServiceImpl implements IParameterService {
    @Override
    public String getValue(String name) {
        return null;
    }

    @Override
    public Map<String, String> getAllValues() {
        return null;
    }

    @Override
    public void save(Object object) {

    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public Object getItemById(String id) {
        return null;
    }
}
