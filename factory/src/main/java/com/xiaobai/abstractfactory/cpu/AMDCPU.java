package com.xiaobai.abstractfactory.cpu;

/**
 * @author xiaobai
 * @date 2019/6/2 19:26
 * @since 1.0
 * AMD 的CPU
 */
public class AMDCPU implements CPU {
    public void showBrand() {
        System.out.println("AMD CPU");
    }
}
