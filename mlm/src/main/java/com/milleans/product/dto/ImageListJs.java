package com.milleans.product.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Album;

import java.util.List;

/**
 * Created by LeHu on 2015-04-18 14:19.
 */

public class ImageListJs extends BaseJs {


    private List<Album> albumLInfo;

    public List<Album> getAlbumLInfo() {
        return albumLInfo;
    }

    public void setAlbumLInfo(List<Album> albumLInfo) {
        this.albumLInfo = albumLInfo;
    }
}
