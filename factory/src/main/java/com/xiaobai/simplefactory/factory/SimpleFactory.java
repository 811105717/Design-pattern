package com.xiaobai.simplefactory.factory;

import com.xiaobai.simplefactory.food.Food;
import com.xiaobai.simplefactory.food.Noodles;
import com.xiaobai.simplefactory.food.Rice;

/**
 * @author xiaobai
 * @date 2019/6/2 18:35
 * @since 1.0
 * 简单工厂模式的实现类 根据参数不同 返回不同的食物
 */
public class SimpleFactory {
    /**
     * 工厂方法  创建Food  根据参数不同创建不同的Food
     * @param name 食物名称
     * @return 工厂方法创建的食物
     */
    public Food makeFood(String name){
        if("rice".equals(name)){
            return new Rice();
        }else if ("noodles".equals(name)){
            return new Noodles();
        }else {
            return null;
        }
    }
}
