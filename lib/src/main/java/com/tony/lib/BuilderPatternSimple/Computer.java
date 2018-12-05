package com.tony.lib.BuilderPatternSimple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 步骤4： **定义具体产品类（Product）：电脑
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Computer {
    //电脑组件的集合
    private List<String> parts = new ArrayList<String>();

    //用于将组件组装到电脑里
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (int i = 0;i<parts.size();i++){
            System.out.println("组件" + parts.get(i) + "装好了");
        }
        System.out.println("电脑组装完成，请验收");
    }
}
