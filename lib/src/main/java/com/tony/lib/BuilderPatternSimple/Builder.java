package com.tony.lib.BuilderPatternSimple;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 步骤1： 定义组装的过程（Builder）：组装电脑的过程
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public abstract class Builder {
    //第一步：装CPU
    //声明为抽象方法，具体由子类实现
    public abstract void buildCPU();

    //第二步：装主板
    //声明为抽象方法，具体由子类实现
    public abstract void buildMainboard();

    //第三步：装硬盘
    //声明为抽象方法，具体由子类实现
    public abstract void buildHD();

    //返回产品的方法：获得组装好的电脑
    public abstract Computer getComputer();
}
