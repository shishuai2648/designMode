package com.ss.pattern.decorator.passport.upgrede;

import com.ss.pattern.adapter.ResultMsg;
import com.ss.pattern.decorator.passport.old.ISignInService;

public class SignInForThirdService implements ISignInForThirdService {

    private ISignInService service;

    public SignInForThirdService(ISignInService service){
        this.service = service;
    }


    @Override
    public ResultMsg register(String username, String password) {
        return service.register(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return service.login(username,password);
    }

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
        this.register(username,password);
        return this.login(username,password);
    }

}
