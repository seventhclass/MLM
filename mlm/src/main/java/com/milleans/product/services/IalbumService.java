package com.milleans.product.services;

import com.milleans.model.Album;
import com.milleans.service.ICrud;

import java.util.List;

/**
 * Created by LeHu on 2015-04-18 13:52.
 */
public interface IalbumService extends ICrud {

    public List<Album> getAlbumByProductId(String productId);

}
