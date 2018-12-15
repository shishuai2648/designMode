package com.ss.pattern.strategy.pay;


import com.ss.pattern.strategy.pay.payport.PayType;
import com.ss.pattern.strategy.pay.payport.Payment;

public class Order{

    private String uid;

    private String orderId;

    private double amount;

    // 这个参数完全可以用Payment这个接口代理
    // 为什么不用接口而用策略模式

    // 完美的解决了switch的过程,完全不需要在代码之中写Switch
    // 更不需要写if else if
    public PayState pay(PayType payType){
        return payType.get().pay(this.uid,this.amount);
    }

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
