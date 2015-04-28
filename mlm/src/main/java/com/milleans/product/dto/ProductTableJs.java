package com.milleans.product.dto;

import com.milleans.dto.BaseJs;

import java.util.List;

/**
 * Created by LeHu on 4/23/15 9:18 PM.
 */
public class ProductTableJs extends BaseJs {
    private List<ProductTable> productInfo;

    public List<ProductTable> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<ProductTable> productInfo) {
        this.productInfo = productInfo;
    }
}
