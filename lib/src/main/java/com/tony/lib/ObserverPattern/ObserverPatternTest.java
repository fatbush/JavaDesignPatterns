package com.tony.lib.ObserverPattern;

/**
 * Created by Tony on 2018/12/6
 * description: 说明
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class ObserverPatternTest {

    public static void main(String[] args) throws Exception {

        MyObserver myObserver1 = new MyObserver("observer-1");
        MyObserver myObserver2 = new MyObserver("observer-2");

        MyObservable myObservable = new MyObservable();
        myObservable.addObserver(myObserver1);
        myObservable.addObserver(myObserver2);

        //发布消息
        myObservable.sendChangeMeg("发布更新啦");
    }
}
