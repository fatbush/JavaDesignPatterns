package com.tony.lib.ObserverPattern;

import java.util.Observable;

/**
 * Created by Tony on 2018/12/6
 * description: 说明
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class MyObservable extends Observable {

    public void sendChangeMeg(String content) {
        //方法继承自Observable，标示状态或是内容发生改变
        super.setChanged();

        //方法继承自Observable，通知所有观察者，最后会调用每个Observer的update方法
        super.notifyObservers(content);
    }
}
