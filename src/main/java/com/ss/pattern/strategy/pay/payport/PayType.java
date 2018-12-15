package com.ss.pattern.strategy.pay.payport;

/**
 *     姑且把枚举当做一个常量去维护
 *    @author: shishuai
 *    @date:   2018/12/2 13:14
 */
public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechaPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
