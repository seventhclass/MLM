package com.milleans.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by macbookpro on 2015-03-17.
 */
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "userid")
    private int userid;

    @Column(name = "productId")
    private int productId;

    @Column(name = "autoshiped")
    private int autoshipid;

    @Column(name = "paymentid")
    private int paymentid;

    @Column(name = "status")
    private int status;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAutoshipid() {
        return autoshipid;
    }

    public void setAutoshipid(int autoshipid) {
        this.autoshipid = autoshipid;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
