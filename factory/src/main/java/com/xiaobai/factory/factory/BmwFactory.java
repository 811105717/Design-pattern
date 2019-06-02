package com.xiaobai.factory.factory;

import com.xiaobai.factory.car.BmwCar;
import com.xiaobai.factory.car.Car;
import com.xiaobai.factory.car.MiNiCar;

/**
 * @author xiaobai
 * @date 2019/6/2 19:02
 * @since 1.0
 * Bwm 汽车工厂 实现工厂接口 但是只能生产宝马系列的汽车
 */
public class BmwFactory implements Factory {
    /**
     * 生产汽车的工厂方法
     * @param name 汽车名称
     * @return 汽车
     */
    public Car makeCar(String name) {
        if("BMW".equals(name)){
            return new BmwCar();
        }else if ("MINI".equals(name)){
            return new MiNiCar();
        }else {
            return null;
        }
    }
}
