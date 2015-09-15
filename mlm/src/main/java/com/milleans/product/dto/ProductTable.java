package com.milleans.product.dto;

import java.util.Date;

/**
 * Created by LeHu on 2015-04-18 12:24.
 */
public class ProductTable {

    public int id;

    public String itemCode;

    public String name;

    public int capsuleNumber;

    public float wholesalePrice;

    public float retailPrice;

    public float matchPrice;

    public Date date;

    public String currencyName;

    public String currencySymbol;

    public int currrencyId;

    public int volume;

    public int volume2;

    public String description;

    public String categoryName;

    public int categoryId;

    public String imageName;

    public float getMatchPrice() {
        return matchPrice;
    }

    public void setMatchPrice(float matchPrice) {
        this.matchPrice = matchPrice;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getCurrrencyId() {
        return currrencyId;
    }

    public void setCurrrencyId(int currrencyId) {
        this.currrencyId = currrencyId;
    }

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

    public String getCurrencyName() {
        return currencyName;
    }


    public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
