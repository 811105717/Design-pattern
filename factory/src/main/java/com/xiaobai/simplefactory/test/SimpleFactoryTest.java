package com.xiaobai.simplefactory.test;

import com.xiaobai.simplefactory.factory.SimpleFactory;
import com.xiaobai.simplefactory.food.Food;

/**
 * @author xiaobai
 * @date 2019/6/2 19:05
 * @since 1.0
 * 测试类
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //首先 先来个工厂 我们需要的东西都由工厂来创建
        SimpleFactory factory = new SimpleFactory();
        //先来一个米饭
        Food rice = factory.makeFood("rice");
        if(null!=rice){
            rice.foodName();
        }
        //再来一个面条
        Food noodles = factory.makeFood("noodles");
        if(null!=noodles){
            noodles.foodName();
        }
        //其他的东西是生产不出来的  会是null
        Food chicken = factory.makeFood("chicken");
        if (chicken == null) {
            System.out.println("无法生产 chicken");
        }
    }
}
