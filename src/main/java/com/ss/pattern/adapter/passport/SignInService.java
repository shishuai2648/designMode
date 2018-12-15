package com.ss.pattern.adapter.passport;

import com.ss.pattern.adapter.Member;
import com.ss.pattern.adapter.ResultMsg;

public class SignInService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password){

        return new ResultMsg("200","注册成功",new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }

}
