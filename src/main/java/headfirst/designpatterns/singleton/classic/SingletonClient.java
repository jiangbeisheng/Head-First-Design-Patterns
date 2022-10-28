package headfirst.designpatterns.singleton.classic;

/**
 * 经典单例模式启动类
 *
 * @author lucas
 * @since 2022年10月28日22:20:01
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
