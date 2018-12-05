package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 第五步：构造Computer
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public void construct (String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
