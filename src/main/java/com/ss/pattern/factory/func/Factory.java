package com.ss.pattern.factory.func;

import com.ss.pattern.factory.Milk;

/**
 * 共产模型
 */
public interface Factory {

    // 工厂必须具有生产产品的技能，统一的产品出口

    Milk getMilk();
}
