package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 第一步：计算机抽象类，即Product角色
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return String.format("Computer [Board=%s, Display=%s, OS=%s]", mBoard, mDisplay, mOS);
    }
}