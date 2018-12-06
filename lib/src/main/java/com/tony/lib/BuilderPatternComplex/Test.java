package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 第七步 测试
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        builder.setAge(23)
                .setName("Mirhunana")
                .setSex(true)
                .setHeight(180)
                .setWeight(100);
        Person person = builder.create();
        System.out.println(person.toString());
    }
}
