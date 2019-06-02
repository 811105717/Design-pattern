package com.xiaobai.abstractfactory.mainboard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:30
 * @since 1.0
 * AMD 主板 只兼容AMD CPU
 */
public class AMDMainBoard implements MainBoard {
    public void showBrand() {
        System.out.println("AMD Main Board");
    }
}
