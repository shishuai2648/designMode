package com.ss.pattern.adapter;

import com.ss.pattern.adapter.passport.SignInForThirdService;

public class SignInForThirdServiceTest {

    public static void main(String[] args) {

        SignInForThirdService service = new SignInForThirdService();
        // 可以加一层策略模式
        // 不改变原来的代码，也要能兼容新的需求
        service.loginForQQ("dqwexcaerqwdauh9j4654qwe5");




    }

}
