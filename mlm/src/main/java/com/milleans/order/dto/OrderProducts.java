package com.milleans.order.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by LeHu on 7/11/15 12:34 AM.
 */
public class OrderProducts {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String itemCode;

    private String name;

    private int quantity;

    private String currency;

    private BigDecimal price;

    private int volume;

    private Integer volume2;

    private BigDecimal priceTotal;

    private BigInteger pointsTotal;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Integer getVolume2() {
        return volume2;
    }

    public void setVolume2(Integer volume2) {
        this.volume2 = volume2;
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
