package com.xiaobai.abstractfactory.computerfactory;

import com.xiaobai.abstractfactory.cpu.CPU;
import com.xiaobai.abstractfactory.mainboard.MainBoard;

/**
 * @author xiaobai
 * @date 2019/6/2 19:36
 * @since 1.0
 * 实体电脑类
 */
public class Computer {
    /**
     * CPU  必须与主板是同一厂商
     */
    private CPU cpu;
    /**
     * 主板 必须与CPU 是同一厂商
     */
    private MainBoard mainBoard;

    /**
     * 电脑的品牌
     */
    private String brand;

    /**
     * 构造方法组装电脑
     * @param brand 品牌
     * @param cpu CPU
     * @param mainBoard 主板
     */
    public Computer(String brand,CPU cpu,MainBoard mainBoard){
        this.brand = brand;
        this.cpu =cpu;
        this.mainBoard =mainBoard;
    }

    public void show(){
        System.out.println("组装好的电脑，品牌："+brand+"  CPU品牌： "+cpu+" 主板品牌："+mainBoard);
    }

}
