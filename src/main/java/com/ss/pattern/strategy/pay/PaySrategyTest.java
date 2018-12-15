package com.ss.pattern.strategy.pay;

import com.ss.pattern.strategy.pay.payport.AliPay;
import com.ss.pattern.strategy.pay.payport.JDPay;
import com.ss.pattern.strategy.pay.payport.PayType;
import com.ss.pattern.strategy.pay.payport.Payment;

import java.util.ArrayList;
import java.util.Comparator;

public class PaySrategyTest {

    public static void main(String[] args) {

        // 将商品添加到购物车，再从购物车中下单
        // 直接从下单开始
        Order order = new Order("1","2018120210000009",1000.45);

        // 开始支付，选择：微信支付，支付宝，银联支付，京东白条，财务通
        // 每个渠道它的支付的具体算法是不一样的
        // 基本算法是固定的
        // 这个值是在支付的时候才确定使用哪个值
        System.out.println(order.pay(PayType.ALI_PAY));

        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

        new ArrayList<>().sort(comparator);

    }
}
