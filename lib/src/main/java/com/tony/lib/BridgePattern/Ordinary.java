package com.tony.lib.BridgePattern;

/**
 * Created by Tony on 2018/12/7
 * description: 说明 5.2 不加糖的子类
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Ordinary extends CoffeeAdditives {

    @Override
    public String addSomething() {
        return "原味";
    }
}
