package com.tony.lib.AdapterPattern.ClassMode;

/**
 * Created by Tony on 2018/12/4
 * description: 说明 创建源类（原有的插头）
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class PowerPort220V {
    /**
     * 原有插头只能输出220V
     */
    public void Output220v(){
        System.out.println(String.format("输出220v"));
    }
}
