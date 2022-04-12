package com.controllers.models;
import javax.persistence.*;
@Entity
@Table(name = "`ORDERS`")
public class Order {

    @Id
    @Column(name = "ORDER_ID")
    private int orderId;
    @Column(name = "ITEM_ID")
    private int itemId;
    @Column(name = "IS_PAID")
    private String isPaid;

    public Order(){
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                ", isPaid='" + isPaid + '\'' +
                '}';
    }
}
