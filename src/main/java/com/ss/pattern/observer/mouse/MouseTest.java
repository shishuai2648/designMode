package com.ss.pattern.observer.mouse;

import com.ss.pattern.observer.core.Event;

import java.lang.reflect.Method;

public class MouseTest {

    public static void main(String[] args) {

        MouseEventCallback mouseEventCallback = new MouseEventCallback();
        Method onClick = null;
        try {
            onClick = MouseEventCallback.class.getMethod("onClick", Event.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        // 人为的代用鼠标的单击事件
        Mouse mouse = new Mouse();
        mouse.addListenter(MouseEventType.ON_CLICK,mouseEventCallback,onClick);
        mouse.click();

    }
}
