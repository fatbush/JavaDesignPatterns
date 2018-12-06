package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 1、定义一个Person类，他包含了所有属性的get,set方法。
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Person {
    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;

    public Person(String name, boolean sex, int age, float height, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("个人信息： \n" +
                "  姓名：%s\n" +
                "  男性：%b\n" +
                "  年龄：%d\n" +
                "  身高：%f\n" +
                "  体重：%f\n", this.name, this.sex, this.age, this.height, this.weight);
    }
}