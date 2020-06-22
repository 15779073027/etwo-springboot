package com.jxnu.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author dk
 * @version 1.0
 * @date 2020/3/17 9:01
 */
@Data
public class Type implements Serializable {

    //菜品类型编号
    private Integer typeId;
    //店铺编号
    private Integer typeShopId;
    //菜品类型名
    private String typeName;

    //菜品类型所有的菜品
    private List<Dish> dishes;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeShopId() {
        return typeShopId;
    }

    public void setTypeShopId(Integer typeShopId) {
        this.typeShopId = typeShopId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", typeShopId=" + typeShopId +
                ", typeName='" + typeName + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
