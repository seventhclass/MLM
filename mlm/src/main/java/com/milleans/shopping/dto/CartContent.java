package com.milleans.shopping.dto;

/**
 * Created by LeHu on 4/25/15 12:12 AM.
 */
public class CartContent {

    private String imageName;

    private String name;

    private int cartId;

    private String capsuleNumber;

    private String transactionprice;

    private String quantity;

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

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCapsuleNumber() {
        return capsuleNumber;
    }

    public void setCapsuleNumber(String capsuleNumber) {
        this.capsuleNumber = capsuleNumber;
    }

    public String getTransactionprice() {
        return transactionprice;
    }

    public void setTransactionprice(String transactionprice) {
        this.transactionprice = transactionprice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
