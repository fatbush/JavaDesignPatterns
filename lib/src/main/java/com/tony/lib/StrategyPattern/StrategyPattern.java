package com.tony.lib.StrategyPattern;

/**
 * Created by Tony on 2018/12/4
 * description: 策略模式
 * 定义一系列算法，将每个算法封装到具有公共接口的一系列策略类中，从而使它们可以相互替换 & 让算法可在不影响客户端的情况下发生变化
 * 说明 客户端调用-让销售员进行促销活动的落地
 * 例程出处：https://www.jianshu.com/p/0c62bf587b9c
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class StrategyPattern {
    public static void main(String[] args){

        ContextSalesMan mSalesMan;

        //春节来了，使用春节促销活动
        System.out.println("对于春节：");
        mSalesMan =  new ContextSalesMan();
        mSalesMan.salesMan("A");
        mSalesMan.salesManShow();


        //中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        mSalesMan = new ContextSalesMan();
        mSalesMan.salesMan("B");
        mSalesMan.salesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        mSalesMan = new ContextSalesMan();
        mSalesMan.salesMan("C");
        mSalesMan.salesManShow();

        return;
    }
}
