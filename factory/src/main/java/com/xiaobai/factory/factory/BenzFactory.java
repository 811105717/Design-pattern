package com.xiaobai.factory.factory;

import com.xiaobai.factory.car.BenzCar;
import com.xiaobai.factory.car.Car;
import com.xiaobai.factory.car.MaybachCar;

/**
 * @author xiaobai
 * @date 2019/6/2 19:00
 * @since 1.0
 * 奔驰工厂 实现工厂接口 但只能生产奔驰系列的汽车
 */
public class BenzFactory implements Factory {
    /**
     * 生产汽车的工厂方法
     * @param name 汽车名称
     * @return 生产的结果
     */
    public Car makeCar(String name) {
        if("benz".equals(name)){
            return new BenzCar();
        }else if("Maybach".equals(name)){
            return new MaybachCar();
        }else {
            return null;
        }
    }
}
