package com.xiaobai.factory.factory;

import com.xiaobai.factory.car.Car;

/**
 * @author xiaobai
 * @date 2019/6/2 18:51
 * @since 1.0
 * 工厂接口 其余工厂都是以该规范实现
 */
public interface Factory {
    /**
     * 生产汽车的工厂方法
     * @return 生产的汽车
     */
    Car makeCar(String name);
}
