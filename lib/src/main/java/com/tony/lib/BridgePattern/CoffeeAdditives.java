package com.tony.lib.BridgePattern;

/**
 * Created by Tony on 2018/12/7
 * description: 说明 3 实现部分，也就是加不加糖
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public abstract class CoffeeAdditives {
    /**
     * 具体添加什么东西由子类决定
     *
     * @return 添加的东西，比如加糖
     */
    public abstract String addSomething();
}
