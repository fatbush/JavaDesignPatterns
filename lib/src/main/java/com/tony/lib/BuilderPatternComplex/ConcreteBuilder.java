package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/6
 * description: 说明 3、 具体建造者类ConcreteBuilder，就是前面的Builder，只是它实现了一个共同的Builder接口
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class ConcreteBuilder implements Builder {

    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setHeight(float height) {
        this.height = height;
        return this;
    }

    public Builder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public Person create() {
        return new Person(name, sex, age, height, weight);
    }
}
