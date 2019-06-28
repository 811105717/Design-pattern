package test;

import builder.Builder;

/**
 * @author xiaobai
 * @date 2019/6/28 11:37
 * @since 1.0
 * 测试类
 */
public class TestBuilder {
    public static void main(String[] args) {
        //  使用的时候 直接调用 builder方法
        Builder b = Builder.builder().id("11001").name("xiaobai01").age(18).build();
        System.out.println(b);

        // 这里演示  不写age的时候  默认值
        Builder b2 = Builder.builder().id("11002").name("xiaobai02").build();
        System.out.println(b2);

        // 这里演示  当不写name时  抛出异常
//        Builder b3 = Builder.builder().id("11001").age(18).build();
//        System.out.println(b3);

    }
}
