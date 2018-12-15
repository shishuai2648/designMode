package com.ss.pattern.delegate;

import com.ss.pattern.delegate.controller.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 相当于是项目经理的角色
 */
public class ServletDispatcher {

    public ServletDispatcher() {
        Class<MemberAction> memberActionClass = MemberAction.class;
        try {
            handlerMapping.add(
                    new Handler().
                            setController(memberActionClass.newInstance()).
                            setMethod(memberActionClass.getMethod("getMemberById",new Class[]{String.class})).
                            setUrl("/web/getMemberById.json")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Handler> handlerMapping = new ArrayList<>();

    public void doService(HttpServletRequest request,HttpServletResponse response){
        doDispatch(request,response);
    }

    public void doDispatch(HttpServletRequest request,HttpServletResponse response){
        // 委派模式
        // 1、获取用户请求的url
        //      按照J2EE的标准、每个URL会对应一个Servlet，url由浏览器输入
        String uri = request.getRequestURI();
        // 2、Servlet拿到url以后，要做权衡(要做判断，要做选择)
        //      根据用户请求的URL，去找到这个URL对应的某一个java类的方法
        // 3、通过拿到的URL,去HandlerMapping(我们把它认为是策略常量)
        Handler handler = null;
        for(Handler h : handlerMapping){
            if(uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        // 4、将具体的任务分发个Method(通过反射去调用其对应的方法)
        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 5、获取到Method执行的结果，通过Response返回出去
        // response.getWriter().write(object);
    }

    class Handler{

        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
