package com.tony.lib.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Tony on 2018/12/6
 * description: 说明 观察者
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class MyObserver implements Observer {
    private String mName;

    public MyObserver(String name) {
        mName = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(mName + "-->" + "update: " + arg);
    }
}
