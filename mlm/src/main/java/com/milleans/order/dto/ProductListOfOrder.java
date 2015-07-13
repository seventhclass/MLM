package com.milleans.order.dto;

import com.milleans.dto.BaseJs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by LeHu on 7/11/15 12:51 AM.
 */
public class ProductListOfOrder extends BaseJs {

    private List<OrderProducts> myOrderInfo;

    private int volumeTotal;

    private BigDecimal priceTotal=new BigDecimal(0);

    private BigInteger pointsTotal=new BigInteger(String.valueOf(0));

    public List<OrderProducts> getMyOrderInfo() {
        return myOrderInfo;
    }

    public void setMyOrderInfo(List<OrderProducts> myOrderInfo) {
        this.myOrderInfo = myOrderInfo;
    }

    public int getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(int volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public BigDecimal getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(BigDecimal priceTotal) {
        this.priceTotal = priceTotal;
    }

    public BigInteger getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(BigInteger pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
}
