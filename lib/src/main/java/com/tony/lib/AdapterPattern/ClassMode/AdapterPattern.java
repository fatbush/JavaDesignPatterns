package com.tony.lib.AdapterPattern.ClassMode;

/**
 * Created by Tony on 2018/12/4
 * description: 说明
 * https://www.jianshu.com/p/9d0575311214
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class AdapterPattern {
    public static void main(String[] args){
        Target mAdapter220V = new Adapter220V();
        ImportedMachine mImportedMachine = new ImportedMachine();

        //用户拿着进口机器插上适配器（调用Convert_110v()方法）
        //再将适配器插上原有插头（Convert110v()方法内部调用Output220v()方法输出220V）
        //适配器只是个外壳，对外提供110V，但本质还是220V进行供电
        mAdapter220V.convert110v();
        mImportedMachine.work();
    }
}
