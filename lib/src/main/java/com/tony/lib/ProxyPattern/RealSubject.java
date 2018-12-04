package com.tony.lib.ProxyPattern;

/**
 * Created by Tony on 2018/12/4
 * description: 说明创建真实对象类（RealSubject）,即”我“
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class  RealSubject implements Subject {

    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}
