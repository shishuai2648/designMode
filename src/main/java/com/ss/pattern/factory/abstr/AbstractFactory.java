package com.ss.pattern.factory.abstr;

import com.ss.pattern.factory.Milk;

/**
 *      抽象工厂    是用户的主入口
 *      在Spring中应用的最为广泛的应用模式
 *      易于扩展
 */
public abstract class AbstractFactory {

    // 公共的逻辑
    // 方便与统一管理

    /**
     * 获得一个蒙牛品牌的牛奶
     * @return
     */
    public abstract Milk getMengniu();

    /**
     * 获得一个伊利品牌的牛奶
     * @return
     */
    public abstract Milk getYiLi();

    /**
     * 获得一个特仑苏品牌的牛奶
     * @return
     */
    public abstract Milk getTelunsu();


}
