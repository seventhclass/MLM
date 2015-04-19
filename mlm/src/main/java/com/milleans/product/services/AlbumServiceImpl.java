package com.milleans.product.services;

import com.milleans.model.Album;
import com.milleans.product.dao.IalbumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 2015-04-18 13:54.
 */
@Service("albumservice")
@Transactional
public class AlbumServiceImpl implements IalbumService {

    @Autowired
    private IalbumDao albumDao;

    @Override
    public void save(Object object) {
        albumDao.save(object);
    }

    @Override
    public void remove(Object object) {
        albumDao.remove(object);
    }

    @Override
    public void update(Object object) {
        albumDao.update(object);
    }

    @Override
    public Object getItemById(String id) {
        return albumDao.getItemById(id);
    }

    @Override
    public List<Album> getAlbumByProductId(String productId) {

        List<Album> al= albumDao.getAlbumByProductId(productId);
        return al;
    }
}
