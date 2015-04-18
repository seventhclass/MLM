package com.milleans.product.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Product;
import java.util.List;

/**
 * Created by LeHu on 2015-04-15 21:35.
 */
public class ProductListJs extends BaseJs {

    private List<Product> productInfo;

    public List<Product> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<Product> productInfo) {
        this.productInfo = productInfo;
    }
}
