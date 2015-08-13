package com.milleans.shipping.dto;

/**
 * Created by LeHu on 8/9/15 2:58 PM.
 */
public class ShipInfo {

    private String orderIdL;

    private String userId;

    private int autoShip;

    private String autoShipDate;

    private String shipMethod;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getOrderIdL() {
        return orderIdL;
    }

    public void setOrderIdL(String orderIdL) {
        this.orderIdL = orderIdL;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAutoShip() {
        return autoShip;
    }

    public void setAutoShip(int autoShip) {
        this.autoShip = autoShip;
    }

    public String getAutoShipDate() {
        return autoShipDate;
    }

    public void setAutoShipDate(String autoShipDate) {
        this.autoShipDate = autoShipDate;
    }

    public String getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }
}
