package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 第三步 抽象Builder类
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public abstract class Builder {

    /**
     * 设置主板
     * @param board
     */
    public abstract void buildBoard(String board);


    /**
     * 设置显示器
     *
     * @param display
     */
    public abstract void buildDisplay(String display);


    /**
     * 设置操作系统
     *
     */
    public abstract void buildOS();

    /** 创建Computer
     *
     * @return
     */
    public abstract Computer create();
}
