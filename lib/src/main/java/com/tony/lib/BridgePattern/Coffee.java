package com.tony.lib.BridgePattern;

/**
 * Created by Tony on 2018/12/7
 * description: 说明 1 抽象部分，也就是咖啡类，CoffeeAdditives为实现部分也就是加不加糖，impl为实现部分的引用
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee (CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体是什么样的由子类决定
     */
    public abstract void makeCoffee();
}
