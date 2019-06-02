package com.xiaobai.abstractfactory.computerfactory;

import com.xiaobai.abstractfactory.cpu.CPU;
import com.xiaobai.abstractfactory.mainboard.MainBoard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:20
 * @since 1.0
 * 抽象的最终产品的工厂
 */
public interface BrandFactory {
    /**
     * 生产 cpu的工厂方法
     * @return cpu
     */
    CPU makeCpu();

    /**
     * 生产主板的工厂方法
     * @return mainboard
     */
    MainBoard makeMainBoard();
}
