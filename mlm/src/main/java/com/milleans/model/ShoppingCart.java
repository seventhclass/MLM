package com.milleans.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by macbookpro on 2015-03-18.
 */
@Entity
@Table(name = "t_shoppingcart")
public class ShoppingCart {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "userid")
    private int userid;

    @Column(name = "date")
    private Date date;

    @Column(name = "productid")
    private int productId;

    @Column(name = "quantity")
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
