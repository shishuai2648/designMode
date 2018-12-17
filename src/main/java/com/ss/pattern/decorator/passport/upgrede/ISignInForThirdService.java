package com.ss.pattern.decorator.passport.upgrede;
import com.ss.pattern.adapter.ResultMsg;
import com.ss.pattern.decorator.passport.old.ISignInService;

public interface ISignInForThirdService extends ISignInService {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String telphone,String code);

    ResultMsg loginForRegist(String username,String password);

}
