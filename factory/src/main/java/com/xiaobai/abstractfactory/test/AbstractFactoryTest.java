package com.xiaobai.abstractfactory.test;

import com.xiaobai.abstractfactory.computerfactory.AMDFactory;
import com.xiaobai.abstractfactory.computerfactory.Computer;
import com.xiaobai.abstractfactory.computerfactory.IntelFactory;
import com.xiaobai.abstractfactory.cpu.CPU;
import com.xiaobai.abstractfactory.mainboard.MainBoard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:43
 * @since 1.0
 * 测试类
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        /**
         *
         * 抽象工厂的好处就是可以避免不兼容问题  其细节各个零部件还是使用工厂方法（我这里可能写得不是很规范）
         * 然后将生产的零件统一组装成我们需要的东西
         * 注意这里假设的情况是 Intel 的产品与 AMD 的产品不兼容
         */
        //先来一个Intel 工厂 生产cpu和主板
        IntelFactory intelFactory = new IntelFactory();
        //抽象生产主板和cpu
        CPU cpu = intelFactory.makeCpu();
        MainBoard mainBoard = intelFactory.makeMainBoard();
        //组装
        Computer computer = new Computer("Intel", cpu, mainBoard);
        computer.show();

        System.out.println("=============================");
        //再来一个AMD的抽象工厂
        AMDFactory amdFactory = new AMDFactory();
        //生产主板和cpu
        cpu = amdFactory.makeCpu();
        mainBoard = amdFactory.makeMainBoard();
        //组装
        computer = new Computer("AND",cpu,mainBoard);
        computer.show();
        //这样 我们就解决了不兼容问题
    }
}
