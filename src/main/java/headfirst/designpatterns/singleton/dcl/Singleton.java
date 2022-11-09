package headfirst.designpatterns.singleton.dcl;

/**
 * 用双重检查加锁，在getInstance中减少使用同步
 *
 * @author lucas
 * @since 2022年11月09日14:20:11
 */
public class Singleton {
    /**
     * 可见性的单例对象
     */
    private volatile static Singleton uniqueInstance;

    /**
     * 私有化对象
     */
    private Singleton() {
    }

    /**
     * 只会执行一次，有volatile判空得以精确
     * 有了锁synchronized多线程环境下得以安全
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
