package com.ss.pattern.strategy.pay.payport;

import com.ss.pattern.strategy.pay.PayState;

public interface Payment {
    PayState pay(String uid, double amount);
}
