package headfirst.designpatterns.singleton.threadsafe;

/**
 * 线程安全的延迟加载
 * 延迟加载的好处是节约资源，用到才创建对象。
 *
 * @author lucas
 * @since 2022年11月09日13:28:10
 */
public class Singleton {
    private static Singleton uniqueInstance;

    /**
     * 私有化构造，不让通过new创建对象
     */
    private Singleton() {
    }

    /**
     * 线程安全的延迟加载单例模式，但是性能会大幅度下降
     *
     * @return 单例对象
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    /**
     * other useful methods here
     *
     * @return 字符串
     */
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
