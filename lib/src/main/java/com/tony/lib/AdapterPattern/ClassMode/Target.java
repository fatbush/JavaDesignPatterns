package com.tony.lib.AdapterPattern.ClassMode;

/**
 * Created by Tony on 2018/12/4
 * description: 创建Target接口（期待得到的插头）：能输出110V（将220V转换成110V）
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public interface Target {
    /**
     * 将220V转换输出110V（原有插头（Adaptee）没有的）
     */
    void convert110v();
}
