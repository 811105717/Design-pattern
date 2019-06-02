package com.xiaobai.abstractfactory.computerfactory;

import com.xiaobai.abstractfactory.cpu.CPU;
import com.xiaobai.abstractfactory.cpu.IntelCPU;
import com.xiaobai.abstractfactory.mainboard.IntelMainBoard;
import com.xiaobai.abstractfactory.mainboard.MainBoard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:34
 * @since 1.0
 * 抽象工厂 Intel 工厂 只生产 intel 的主板和CPU
 */
public class IntelFactory implements BrandFactory{
    public CPU makeCpu() {
        return new IntelCPU();
    }

    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }
}
