package com.tony.lib.BuilderPatternComplex;


/**
 * Created by Tony on 2018/12/5
 * description: 说明 第四步：具体的Builder类
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class MacbookBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public void  buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
