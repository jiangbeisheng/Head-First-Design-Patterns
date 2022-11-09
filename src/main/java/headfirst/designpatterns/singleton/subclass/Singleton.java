package headfirst.designpatterns.singleton.subclass;

/**
 * 被子类继承后，子类可以通过类名静态调用父类的静态方法。
 *
 * @author lucas
 * @since 2022年11月09日22:14:48
 */
public class Singleton {
    /**
     * 静态变量，没有volatile，懒加载
     */
    protected static Singleton uniqueInstance;

    /**
     * 私有构造，单例必备
     */
    protected Singleton() {
    }

    /**
     * 效率极低的重量级锁synchronized
     *
     * @return 单例对象
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
