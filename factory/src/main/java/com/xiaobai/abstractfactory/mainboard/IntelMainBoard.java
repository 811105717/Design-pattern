package com.xiaobai.abstractfactory.mainboard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:29
 * @since 1.0
 * Intel 主板 只兼容Intel 的CPU （假设）
 */
public class IntelMainBoard implements MainBoard {
    public void showBrand() {
        System.out.println("Intel Main Board");
    }
}
