package com.tony.lib.BuilderPatternSimple;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 步骤5： **客户端调用-小成到电脑城找老板买电脑
 * https://www.jianshu.com/p/be290ccea05a
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class BuilderPattern {
    public static void main(String[] args) {

        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        //沟通需求后，老板叫装机人员去装电脑
        director.construct(builder);

        //装完后，组装人员搬来组装好的电脑
        Computer computer = builder.getComputer();
        //组装人员展示电脑给小成看
        computer.show();
    }
}
