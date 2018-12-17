package com.ss.pattern.decorator.passport.old;

import com.ss.pattern.adapter.Member;
import com.ss.pattern.adapter.ResultMsg;

public interface ISignInService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    com.ss.pattern.adapter.ResultMsg register(String username, String password);

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);

}
