package com.xiaobai.simplefactory.food;

/**
 * @author xiaobai
 * @date 2019/6/2 18:31
 * @since 1.0
 * 米饭类  是一种食物  继承自Food
 */
public class Rice implements Food {
    public void foodName() {
        System.out.println("我是米饭！");
    }
}
