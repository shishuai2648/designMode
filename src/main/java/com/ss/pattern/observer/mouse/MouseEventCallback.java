package com.ss.pattern.observer.mouse;

import com.ss.pattern.observer.core.Event;

/**
 * 回调响应逻辑
 */
public class MouseEventCallback {

    public void onClick(Event event){
        System.out.println("=========触发鼠标点击=========\n" + event);
    }
    public void onDoubleClick(Event event){
        System.out.println("=========触发鼠标双击=========\n" + event);
    }
    public void onUp(Event event){
        System.out.println("=========触发鼠标弹起=========\n" + event);
    }
    public void onDown(Event event){
        System.out.println("=========触发鼠标按下=========\n" + event);
    }
    public void onMove(Event event){
        System.out.println("=========触发鼠标移动=========\n" + event);
    }
    public void onWheel(Event event){
        System.out.println("=========触发鼠标滚动=========\n" + event);
    }
    public void onOver(Event event){
        System.out.println("=========触发鼠标悬停=========\n" + event);
    }
}
