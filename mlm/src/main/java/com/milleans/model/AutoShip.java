package com.milleans.model;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by macbookpro on 2015-03-17.
 */

@Entity
@Table(name = "t_autoship")
public class AutoShip {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "shipdate")
    private int shipdate;

    @Column(name = "userid")
    private int userid;

    @Column(name = "addressid")
    private int addressid;

    @Column(name = "shipmethodid")
    private int shipmethodid;

    @Column(name = "volume")
    private float volume;

    @Column(name = "fee")
    private float fee;

    @Column(name = "paymentid")
    private int paymentid;

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

    public int getShipdate() {
        return shipdate;
    }

    public void setShipdate(int shipdate) {
        this.shipdate = shipdate;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public int getShipmethodid() {
        return shipmethodid;
    }

    public void setShipmethodid(int shipmethodid) {
        this.shipmethodid = shipmethodid;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }
}
