package easycode.common.entity;

import java.util.Date;

/**
 * (OrderList)表实体类
 *
 * @author makejava
 * @since 2018-09-07 10:57:16
 */
public class OrderList {
    
    private String orderId;
    
    private String orderUserId;
    
    private Date orderDateTime;
    
    private Object orderIsSend;
    
    private Object orderIsValid;
    
    private Object orderTotalPrice;
    
    private Object orderStatus;
    
    private String orderComment;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(String orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Date orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public Object getOrderIsSend() {
        return orderIsSend;
    }

    public void setOrderIsSend(Object orderIsSend) {
        this.orderIsSend = orderIsSend;
    }

    public Object getOrderIsValid() {
        return orderIsValid;
    }

    public void setOrderIsValid(Object orderIsValid) {
        this.orderIsValid = orderIsValid;
    }

    public Object getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Object orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Object getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Object orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

}