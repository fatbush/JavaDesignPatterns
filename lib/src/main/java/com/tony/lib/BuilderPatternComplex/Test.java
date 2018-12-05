package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 第七步 测试
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Test {
    public static void main(String[] args) {
        //Builder mBuilder = new MacbookBuilder().buildBoard("英特尔主板").build
        Builder mBuilder = new MacbookBuilder();
        Director pcDirector = new Director(mBuilder);
        pcDirector.construct("英特尔主板", "Retina显示器");
        System.out.println("Computer Info:" + mBuilder.create().toString());
    }
}
