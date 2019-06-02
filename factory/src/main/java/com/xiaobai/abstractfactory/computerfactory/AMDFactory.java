package com.xiaobai.abstractfactory.computerfactory;

import com.xiaobai.abstractfactory.cpu.AMDCPU;
import com.xiaobai.abstractfactory.cpu.CPU;
import com.xiaobai.abstractfactory.mainboard.AMDMainBoard;
import com.xiaobai.abstractfactory.mainboard.MainBoard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:35
 * @since 1.0
 * AMD 的抽象工厂 只生产 AMD 的产品
 */
public class AMDFactory implements BrandFactory{
    public CPU makeCpu() {
        return new AMDCPU();
    }

    public MainBoard makeMainBoard() {
        return new AMDMainBoard();
    }
}
