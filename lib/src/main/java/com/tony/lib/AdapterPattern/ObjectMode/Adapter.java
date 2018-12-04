package com.tony.lib.AdapterPattern.ObjectMode;

/**
 * Created by Tony on 2018/12/4
 * description: 说明 创建适配器类（Adapter）（不适用继承而是委派）
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Adapter implements Target {

    // 直接关联被适配类
    private Adaptee adaptee;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 这里是使用委托的方式完成特殊功能
        this.adaptee.specificRequest();
    }
}
