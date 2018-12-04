package com.tony.lib.ProxyPattern;

/**
 * Created by Tony on 2018/12/4
 * description: 说明 代购（代理对象） 代替 我（真实对象） 去买Mac（间接访问的操作）
 * https://www.jianshu.com/p/a8aa6851e09e
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class ProxyPattern {
    public static void main(String[] args){
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
