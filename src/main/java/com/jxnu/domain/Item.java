package com.jxnu.domain;

import lombok.Data;

/**
 * @author dk
 * @version 1.0
 * @date 2020/3/17 9:02
 * 订单明细
 */
@Data
public class Item {

    //订单编号
    private Integer itemOrderId;
    //菜品编号
    private Integer itemDishId;
    //菜品品数量
    private Integer itemNumber;
    //该菜品待上的数量
    private Integer itemWaitNumber;
    //订单明细所有的菜品
    private Dish dish;

    public Integer getItemOrderId() {
        return itemOrderId;
    }

    public void setItemOrderId(Integer itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    public Integer getItemDishId() {
        return itemDishId;
    }

    public void setItemDishId(Integer itemDishId) {
        this.itemDishId = itemDishId;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Integer getItemWaitNumber() {
        return itemWaitNumber;
    }

    public void setItemWaitNumber(Integer itemWaitNumber) {
        this.itemWaitNumber = itemWaitNumber;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemOrderId=" + itemOrderId +
                ", itemDishId=" + itemDishId +
                ", itemNumber=" + itemNumber +
                ", itemWaitNumber=" + itemWaitNumber +
                ", dish=" + dish +
                '}';
    }
}
