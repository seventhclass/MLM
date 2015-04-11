package com.milleans.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Entity
@Table(name = "t_product")
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "itemcode")
    public String itemCode;

    @Column(name = "name")
    public String name;

    @Column(name = "capsulenumber")
    public int capsuleNumber;

    @Column(name = "wholesaleprice")
    public float wholesalePrice;

    @Column(name = "retailprice")
    public float retailPrice;

    @Column(name = "date")
    public Date date;

    @Column(name = "currencyid")
    public int currencyId;

    @Column(name = "volume")
    public int volume;

    @Column(name = "volume2")
    public int volume2;

    @Column(name = "description")
    public String description;

    @Column(name = "categoryid")
    public int categoryId;


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getCapsuleNumber() {
        return capsuleNumber;
    }

    public void setCapsuleNumber(int capsuleNumber) {
        this.capsuleNumber = capsuleNumber;
    }

    public float getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(float wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
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
}
