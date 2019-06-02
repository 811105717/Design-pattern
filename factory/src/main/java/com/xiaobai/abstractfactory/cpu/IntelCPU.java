package com.xiaobai.abstractfactory.cpu;

/**
 * @author xiaobai
 * @date 2019/6/2 19:23
 * @since 1.0
 * 英特尔CPU 只能匹配Intel主板
 */
public class IntelCPU implements CPU {
    /**
     * 模拟输出品牌的方法
     */
    public void showBrand(){
        System.out.println("Intel CPU");
    }
}
