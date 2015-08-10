package com.milleans.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by macbookpro on 2015-03-17.
 */
@Entity
@Table(name = "t_orderdetails")
public class Orderdetails implements Cloneable{

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "seq")
    private int seq;

    @Column(name = "createddate")
    private Date createdDate;

    @Column(name = "endedate")
    private Date endedate;

    @Column(name = "productid")
    private int productId;

    @Column(name = "itemcode")
    private String itemCode;

    @Column(name = "transactionprice")
    private float transactionprice;

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

    @Column(name = "userid")
    private int userid;

    @Column(name = "orderIdl")
    private String orderIdl;

    @Column(name = "t_currency_id")
    private int currencyId;

    @Column(name = "t_paymentmethod_id")
    private int paymentMethodId;

    @Column(name = "status")
    private int status;

    @Column(name = "autoship_id")
    private int autoshipId;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAutoshipId() {
        return autoshipId;
    }

    public void setAutoshipId(int autoshipId) {
        this.autoshipId = autoshipId;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getEndedate() {
        return endedate;
    }

    public void setEndedate(Date endedate) {
        this.endedate = endedate;
    }

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

    public float getTransactionprice() {
        return transactionprice;
    }

    public void setTransactionprice(float transactionprice) {
        this.transactionprice = transactionprice;
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getOrderIdl() {
        return orderIdl;
    }

    public void setOrderIdl(String orderIdl) {
        this.orderIdl = orderIdl;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public Object clone() {

        Orderdetails orderdetails=new Orderdetails();

        orderdetails.setAutoshipId(this.getAutoshipId());
        orderdetails.setCreatedDate(Calendar.getInstance().getTime());
        orderdetails.setCurrencyId(this.getCurrencyId());
        orderdetails.setDescription(this.getDescription());



        return orderdetails;
    }

}
