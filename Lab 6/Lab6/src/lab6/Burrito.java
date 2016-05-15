/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author zane
 */
public class Burrito {
    private int orderNo;
    private String orderName;
    private String burritoType;
    private int quantity;
    private float burritoPrice;

    public Burrito() {
        orderNo = 0;
        orderName = "";
        burritoType = "";
        quantity = 0;
        burritoPrice = 0.0f;
    }

    public Burrito(int orderNo, String orderName, String burritoType, int quantity, float burritoPrice) {
        this.orderNo = orderNo;
        this.orderName = orderName;
        this.burritoType = burritoType;
        this.quantity = quantity;
        this.burritoPrice = burritoPrice;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getBurritoType() {
        return burritoType;
    }

    public void setBurritoType(String burritoType) {
        this.burritoType = burritoType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getBurritoPrice() {
        return burritoPrice;
    }

    public void setBurritoPrice(float burritoPrice) {
        this.burritoPrice = burritoPrice;
    }
    
    public String toString() {
        String fmt = "$0.00";
        return "Customer: " + orderName + ", Order No. " + orderNo + ", Burrito: " + burritoType + ", Quantity: " + quantity + ", Total: " + MyUtils.formatNum(burritoPrice * quantity, fmt);
    }
    
}
