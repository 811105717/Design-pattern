package com.xiaobai.factory.car;

/**
 * @author xiaobai
 * @date 2019/6/2 18:55
 * @since 1.0
 * 奔驰汽车的实体类 实现汽车接口
 */
public class BenzCar implements Car {
    public void showBrand() {
        System.out.println("我是一台奔驰车");
    }
}
