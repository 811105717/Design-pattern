package hunger;

/**
 * @author xiaobai
 * @date 2019/6/9 20:21
 * @since 1.0
 * 单例模式的懒汉实现
 */
public class Singleton {
    /**
     * 第一步 构造方法私有化 防止外部new 实例
     */
    private Singleton(){}

    /**
     *直接来一个私有属性 所谓饿汉模式 就是直接new 出来（创建的时候就已经new 好了）
     */
    private static Singleton instance = new Singleton();

    /**
     * 获取对象的方法  直接返回当前类的属性中构建的那个对象，每次返回的都是那一个
     * @return 唯一的单例
     */
    public Singleton getInstance(){
        return instance;
    }

}
