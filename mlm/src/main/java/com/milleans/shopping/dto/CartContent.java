package com.milleans.shopping.dto;

/**
 * Created by LeHu on 4/25/15 12:12 AM.
 */
public class CartContent {

    private int id;

    private int productId;

    private String imageName;

    private String name;

    private int capsuleNumber;

    private float wholesalePrice;

    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
