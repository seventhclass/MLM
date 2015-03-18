package com.milleans.model;

import javax.persistence.*;

/**
 * Created by macbookpro on 2015-03-17.
 */
@Entity
@Table(name = "t_orderdetails")
public class Orderdetails {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "seq")
    private int seq;

    @Column(name = "date")
    private int date;

    @Column(name = "productid")
    private int productId;

    @Column(name = "itemcode")
    private String itemCode;

    @Column(name = "price")
    private float price;

    @Column(name = "currencyid")
    private int currencyId;

    @Column(name = "volume")
    private int volume;

    @Column(name = "volume2")
    private int volume2;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price_total")
    private float priceTotal;

    @Column(name = "point_total")
    private float pointTotal;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume2() {
        return volume2;
    }

    public void setVolume2(int volume2) {
        this.volume2 = volume2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(float priceTotal) {
        this.priceTotal = priceTotal;
    }

    public float getPointTotal() {
        return pointTotal;
    }

    public void setPointTotal(float pointTotal) {
        this.pointTotal = pointTotal;
    }
}
