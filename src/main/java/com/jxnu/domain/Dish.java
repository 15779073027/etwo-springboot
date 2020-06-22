package com.jxnu.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dk
 * @version 1.0
 * @date 2020/3/17 9:01
 */
//@Data
public class Dish implements Serializable {

    //菜品编号
    private Integer dishId;
    //菜品类型编号
    private Integer dishTypeId;
    //菜品名
    private String dishName;
    //菜品图片路径
    private String dishImgPath;
    //菜品价格
    private Float dishPrice;
    //菜品数量
    private Integer dishNumber;
    //菜品状态(0被删除，1正常销售)
    private Byte dishStatus;

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getDishTypeId() {
        return dishTypeId;
    }

    public void setDishTypeId(Integer dishTypeId) {
        this.dishTypeId = dishTypeId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishImgPath() {
        return dishImgPath;
    }

    public void setDishImgPath(String dishImgPath) {
        this.dishImgPath = dishImgPath;
    }

    public Float getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(Float dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Integer getDishNumber() {
        return dishNumber;
    }

    public void setDishNumber(Integer dishNumber) {
        this.dishNumber = dishNumber;
    }

    public Byte getDishStatus() {
        return dishStatus;
    }

    public void setDishStatus(Byte dishStatus) {
        this.dishStatus = dishStatus;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishTypeId=" + dishTypeId +
                ", dishName='" + dishName + '\'' +
                ", dishImgPath='" + dishImgPath + '\'' +
                ", dishPrice=" + dishPrice +
                ", dishNumber=" + dishNumber +
                ", dishStatus=" + dishStatus +
                '}';
    }
}
