package com.milleans.shopping.dto;

/**
 * Created by LeHu on 4/25/15 12:12 AM.
 */
public class CartContent {

    private String imageName;

    private String name;

    private int capsuleNumber;

    private float transactionprice;

    private int quantity;

    public int getCapsuleNumber() {
        return capsuleNumber;
    }

    public void setCapsuleNumber(int capsuleNumber) {
        this.capsuleNumber = capsuleNumber;
    }

    public float getTransactionprice() {
        return transactionprice;
    }

    public void setTransactionprice(float transactionprice) {
        this.transactionprice = transactionprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
