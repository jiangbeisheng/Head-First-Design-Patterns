package headfirst.designpatterns.singleton.stat;

/**
 * 急切的创建实例，不使用延迟加载。
 * 适用于总是会用到它，或它对资源占用不大。
 */
public class Singleton {
    /**
     * 在静态初始化时创建实例，保证线程安全
     */
    private static final Singleton uniqueInstance = new Singleton();

    /**
     * 私有构造
     */
    private Singleton() {
    }

    /**
     * 获取唯一实例
     *
     * @return 实例
     */
    public static Singleton getInstance() {
        return uniqueInstance;
    }

    /**
     * other useful methods here
     *
     * @return 我是一个静态初始化的Singleton
     */
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
