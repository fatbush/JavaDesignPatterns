package com.tony.lib.BuilderPatternComplex;

/**
 * Created by Tony on 2018/12/5
 * description: 说明 2、抽象建造者类Builder，就是上面的Builder的接口，目的就是为了为构造者提供统一的接口
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public interface Builder {

    Builder setName(String name);

    Builder setSex(boolean sex);

    Builder setAge(int age);

    Builder setHeight(float height);

    Builder setWeight(float weight);

    Person create();
}
