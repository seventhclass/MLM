package com.milleans.product.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Album;

import java.util.List;

/**
 * Created by LeHu on 2015-04-18 13:56.
 */
public interface IalbumDao extends IDao {

    public Album getItemById(String id);

    List<Album> getAlbumByProductId(String productId);
}
