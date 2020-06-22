package com.jxnu.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author dk
 * @version 1.0
 * @date 2020/3/17 9:02
 */
@Data
public class Order {

    //订单编号
    private Integer orderId;
    //店铺编号
    private Integer orderShopId;
    //桌位编号
    private Byte deskId;
    //订单状态（0待付款，1已付款）
    private Byte orderStatus;
    //下单时间
    private Date orderDateBuy;
    //结账时间
    private Date orderDatePay;
    //总金额
    private Float orderTotalPrice;
    //订单所有的订单明细
    private List<Item> items;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderShopId() {
        return orderShopId;
    }

    public void setOrderShopId(Integer orderShopId) {
        this.orderShopId = orderShopId;
    }

    public Byte getDeskId() {
        return deskId;
    }

    public void setDeskId(Byte deskId) {
        this.deskId = deskId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDateBuy() {
        return orderDateBuy;
    }

    public void setOrderDateBuy(Date orderDateBuy) {
        this.orderDateBuy = orderDateBuy;
    }

    public Date getOrderDatePay() {
        return orderDatePay;
    }

    public void setOrderDatePay(Date orderDatePay) {
        this.orderDatePay = orderDatePay;
    }

    public Float getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Float orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderShopId=" + orderShopId +
                ", deskId=" + deskId +
                ", orderStatus=" + orderStatus +
                ", orderDateBuy=" + orderDateBuy +
                ", orderDatePay=" + orderDatePay +
                ", orderTotalPrice=" + orderTotalPrice +
                ", items=" + items +
                '}';
    }
}
