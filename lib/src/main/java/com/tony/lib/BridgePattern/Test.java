package com.tony.lib.BridgePattern;

/**
 * Created by Tony on 2018/12/7
 * description: 说明
 * 咖啡简单分大杯小杯，加不加糖。泡咖啡就是业务逻辑，而加不加糖则是基本操作，这样我们把泡咖啡定为抽象部分，
 * 子类具体实现是大杯还是小杯；加不加糖则为实现部分，对应子类则实现加不加糖。
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Test {

    public static void main (String[] args) {
        //原味
        Ordinary ordinary = new Ordinary();

        //加糖
        Sugar sugar = new Sugar();

        //大杯咖啡，原味
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();

        //小杯咖啡，原味
        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();

        //大杯咖啡，加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(sugar);
        largeCoffeeSugar.makeCoffee();

        //小杯咖啡，加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(sugar);
        smallCoffeeSugar.makeCoffee();
    }
}
