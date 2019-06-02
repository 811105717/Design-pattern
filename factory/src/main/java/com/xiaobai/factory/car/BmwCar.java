package com.xiaobai.factory.car;

/**
 * @author xiaobai
 * @date 2019/6/2 18:57
 * @since 1.0
 * 宝马实体类  实现汽车接口
 */
public class BmwCar implements Car {
    public void showBrand() {
        System.out.println("我是一台宝马");
    }
}
