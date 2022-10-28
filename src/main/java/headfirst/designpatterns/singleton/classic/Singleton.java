package headfirst.designpatterns.singleton.classic;

// NOTE: This is not thread safe!

/**
 * 获取单例对象类
 *
 * @author lucas
 * @since 2022年10月28日22:21:43
 */
public class Singleton {
    /**
     * 私有静态成员单例对象
     */
    private static Singleton uniqueInstance;

    /**
     * 私有化构造防止创建对象
     */
    private Singleton() {
    }

    /**
     * 公开静态方法获取单例对象
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here

    /**
     * 获取它的某个方法
     *
     * @return 无聊的字符串
     */
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
