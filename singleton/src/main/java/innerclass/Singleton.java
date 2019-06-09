package innerclass;

/**
 * @author xiaobai
 * @date 2019/6/9 21:16
 * @since 1.0
 * 使用内部类的单例模式 这种方式是最好用的一种方式
 */
public class Singleton {
    /**
     * 首先还是构造方法私有化  防止创建内部类 对象
     */
    private Singleton(){}
    /**
     * 来一个内部类 用来创建对象
     */
    private static class InnerHolder{
        private static Singleton instance = new Singleton();
    }
    /**
     * 获取实例的方法
     */
    public static Singleton getInstance(){
        return InnerHolder.instance;
    }
}
