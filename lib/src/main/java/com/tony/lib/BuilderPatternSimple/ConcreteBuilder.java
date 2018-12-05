package com.tony.lib.BuilderPatternSimple;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 步骤3： **创建具体的建造者（ConcreteBuilder）:装机人员
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class ConcreteBuilder extends Builder {
    //创建产品实例
    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.add("组装CPU");
    }

    @Override
    public void buildMainboard() {
        computer.add("组装主板");
    }

    @Override
    public void buildHD() {
        computer.add("组装主板");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
