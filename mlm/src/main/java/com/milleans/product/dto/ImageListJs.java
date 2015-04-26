package com.milleans.product.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Album;

import java.util.List;

/**
 * Created by LeHu on 2015-04-18 14:19.
 */

public class ImageListJs extends BaseJs {


    private List<Album> albumInfo;

	public List<Album> getAlbumInfo() {
		return albumInfo;
	}

	public void setAlbumInfo(List<Album> albumInfo) {
		this.albumInfo = albumInfo;
	}
}
