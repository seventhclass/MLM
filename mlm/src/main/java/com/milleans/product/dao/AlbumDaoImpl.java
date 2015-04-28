package com.milleans.product.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Album;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 2015-04-18 13:56.
 */
@Repository("albumDao")
@Transactional
public class AlbumDaoImpl extends AbstractDao implements IalbumDao {

    public Album getItemById(String id) {
        int _id = Integer.valueOf(id);
        Criteria criteria = this.getCurrentSession().createCriteria(Album.class);
        criteria.add(Restrictions.eq("id", _id));

        List<Album> list = criteria.list();

        if (list == null || list.size() == 0) {
            return null;
        } else
            return list.get(0);
    }

    @Override
    public List<Album> getAlbumByProductId(String productId) {

        int _pid = Integer.valueOf(productId);

        Criteria criteria = this.getCurrentSession().createCriteria(Album.class);
        criteria.add(Restrictions.eq("productId", _pid));

        List<Album> list = criteria.list();

        return list;
    }

}
