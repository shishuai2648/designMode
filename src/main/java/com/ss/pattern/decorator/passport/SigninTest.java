package com.ss.pattern.decorator.passport;

import com.ss.pattern.decorator.passport.old.SignInService;
import com.ss.pattern.decorator.passport.upgrede.ISignInForThirdService;
import com.ss.pattern.decorator.passport.upgrede.SignInForThirdService;

public class SigninTest {

    public static void main(String[] args) {

        // 原有的功能依旧对外开放，依旧保留
        // 新的功能同样也可以使用
        ISignInForThirdService signInForThirdService = new SignInForThirdService(new SignInService());
        signInForThirdService.loginForQQ("xxxssdd");
    }
}
