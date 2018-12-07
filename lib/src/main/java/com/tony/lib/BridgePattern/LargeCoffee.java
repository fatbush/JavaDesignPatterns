package com.tony.lib.BridgePattern;

/**
 * Created by Tony on 2018/12/7
 * description: 说明 2.1 咖啡的子类，大杯和小杯，加不加糖的操作通过impl添加进来
 * 大咖啡
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl.addSomething() + "咖啡");
    }
}
