package com.milleans.order.dto;

/**
 * Created by LeHu on 7/29/15 4:20 PM.
 */
public class OrderDealingInfo {


    private String ordlerIdL;

    private String createDate;

    private String status;

    private String userIdL;

    public String getOrdlerIdL() {
        return ordlerIdL;
    }

    public void setOrdlerIdL(String ordlerIdL) {
        this.ordlerIdL = ordlerIdL;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserIdL() {
        return userIdL;
    }

    public void setUserIdL(String userIdL) {
        this.userIdL = userIdL;
    }
}
