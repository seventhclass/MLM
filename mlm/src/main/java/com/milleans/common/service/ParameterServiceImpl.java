package com.milleans.common.service;

import com.milleans.common.dao.IParameterDao;
import com.milleans.model.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LeHu on 7/14/15 12:35 PM.
 */
@Service("parameterService")
@Transactional
public class ParameterServiceImpl implements IParameterService {


    @Autowired
    private IParameterDao parameterDao;

    @Override
    public String getValue(String name) {

        return this.getAllValues().get(name);
    }

    @Override
    public Map<String, String> getAllValues() {

        Map<String, String> pvMap = new HashMap<>();

        List<Parameter> list = this.parameterDao.getAllValues();

        for (Parameter p : list) {
            pvMap.put(p.getName(), p.getValue());
        }

        return pvMap;
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
