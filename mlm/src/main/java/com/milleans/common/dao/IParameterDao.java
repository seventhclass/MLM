package com.milleans.common.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Parameter;

import java.util.List;

/**
 * Created by LeHu on 7/14/15 12:43 PM.
 */
public interface IParameterDao extends IDao {

    public List<Parameter> getAllValues();


}
