package headfirst.designpatterns.singleton.threadsafe;

/**
 * 线程安全-延迟加载-单例演示
 *
 * @author lucas
 * @since 2022年11月09日13:36:00
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
