package com.milleans.common.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Parameter;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 7/14/15 12:44 PM.
 */
@Repository("parameterDao")
@Transactional
public class ParameterDaoImpl extends AbstractDao implements IParameterDao {
    @Override
    public List<Parameter> getAllValues() {
        Criteria criteria = this.getCurrentSession().createCriteria(Parameter.class);
        return criteria.list();
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
}
