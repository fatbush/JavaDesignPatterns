package com.tony.lib.BuilderPatternSimple;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 步骤2： 电脑城老板委派任务给装机人员（Director）
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Director {

    //指挥装机人员组装电脑
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}
