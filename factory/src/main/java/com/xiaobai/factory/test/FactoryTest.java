package com.xiaobai.factory.test;

import com.xiaobai.factory.car.Car;
import com.xiaobai.factory.factory.BenzFactory;
import com.xiaobai.factory.factory.Factory;

/**
 * @author xiaobai
 * @date 2019/6/2 19:10
 * @since 1.0
 * 测试类
 */
public class FactoryTest {
    public static void main(String[] args) {
        //我们需要先指定一个工厂来生产汽车 比如指定奔驰工厂 （当然 宝马工厂也是可以的 这理就不演示了）
        Factory factory = new BenzFactory();
        //通过奔驰汽车工厂我们只能创建奔驰系列汽车
        Car benz = factory.makeCar("benz");
        if(null!=benz){
            benz.showBrand();
        }
        //我们不能通过奔驰工厂创建宝马汽车
        Car bmw = factory.makeCar("BMW");
        if(null==bmw){
            System.out.println("奔驰工厂无法生产宝马汽车");
        }
        /**
         * 有时我们可能是2个甚至更多个工厂来生产不同的东西 就可以使用这种设计模式
         */
    }
}
