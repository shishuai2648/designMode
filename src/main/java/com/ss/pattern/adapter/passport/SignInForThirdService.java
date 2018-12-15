package com.ss.pattern.adapter.passport;

import com.ss.pattern.adapter.ResultMsg;

public class SignInForThirdService extends SignInService{

    public ResultMsg loginForQQ(String openId){
        // 1、open是全局唯一。我们可以把它当做是一个用户名(加长)。
        // 2、密码默认为null,EMPTY,QQ。
        // 3、注册(在原有的系统里面创建一个用户)
        // 4、调用原有登录方法。
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String password) {
        super.register(username,password);
        return super.login(username,password);
    }




}
