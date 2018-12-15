package com.ss.pattern.strategy.pay.payport;

import com.ss.pattern.strategy.pay.PayState;

public class WechaPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"微信，支付成功",amount);
    }
}
