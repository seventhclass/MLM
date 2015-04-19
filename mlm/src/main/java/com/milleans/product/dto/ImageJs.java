package com.milleans.product.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Album;

/**
 * Created by LeHu on 2015-04-18 13:44.
 */
public class ImageJs extends BaseJs {

    private Album albumInfo;

    public Album getAlbumInfo() {
        return albumInfo;
    }

    public void setAlbumInfo(Album albumInfo) {
        this.albumInfo = albumInfo;
    }
}
