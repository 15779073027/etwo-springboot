package com.jxnu.domain;

import lombok.Data;

/**
 * @author dk
 * @version 1.0
 * @date 2020/3/17 8:51
 */
@Data
public class Shop {

    //店铺编号
    private Integer shopId;
    //店铺名
    private String shopName;
    //店铺地址
    private String shopAddress;
    //店铺图片路径
    private String shopImgPath;
    //店铺公告
    private String shopNotice;
    //店铺状态(忽略这个字段)
    private Byte shopStatus;
    //店铺邮箱
    private String shopEmail;
    //店铺密码
    private String shopPassword;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopImgPath() {
        return shopImgPath;
    }

    public void setShopImgPath(String shopImgPath) {
        this.shopImgPath = shopImgPath;
    }

    public String getShopNotice() {
        return shopNotice;
    }

    public void setShopNotice(String shopNotice) {
        this.shopNotice = shopNotice;
    }

    public Byte getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Byte shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getShopEmail() {
        return shopEmail;
    }

    public void setShopEmail(String shopEmail) {
        this.shopEmail = shopEmail;
    }

    public String getShopPassword() {
        return shopPassword;
    }

    public void setShopPassword(String shopPassword) {
        this.shopPassword = shopPassword;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopImgPath='" + shopImgPath + '\'' +
                ", shopNotice='" + shopNotice + '\'' +
                ", shopStatus=" + shopStatus +
                ", shopEmail='" + shopEmail + '\'' +
                ", shopPassword='" + shopPassword + '\'' +
                '}';
    }
}
