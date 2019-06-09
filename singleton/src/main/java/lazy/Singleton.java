package lazy;

/**
 * @author xiaobai
 * @date 2019/6/9 20:27
 * @since 1.0
 * 单例模式的懒汉模式的实现
 */
public class Singleton {
    /**
     * 首先 还是构造方法私有化 防止外部构建对象
     */
    private Singleton(){}
    /**
     * 再来一个全局的属性  用来保存实例， 注意 这里必须使用volatile 关键字
     * 使用这个关键字的原因 1.刷新内存  2. 避免指令重排
     */
    private static volatile Singleton instance;
    /**
     * 这个是返回实例的方法
     * 双重判断 加锁
     */
    public static Singleton getInstance(){
        //先判断一下instance 是否为null
        if(null==instance){
            // 加锁
            synchronized (Singleton.class){
                //再判断一次
                if (null==instance){
                    //如果真的没有实例 则 new 一个
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
