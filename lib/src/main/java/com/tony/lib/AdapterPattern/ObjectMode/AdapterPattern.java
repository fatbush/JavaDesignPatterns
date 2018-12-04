package com.tony.lib.AdapterPattern.ObjectMode;

/**
 * Created by Tony on 2018/12/4
 * description: 说明
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class AdapterPattern {
    public static void main(String[] args){
        //需要先创建一个被适配类的对象作为参数
        Target mAdapter = new Adapter(new Adaptee());
        mAdapter.request();
    }
}
