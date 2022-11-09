package headfirst.designpatterns.singleton.stat;

/**
 * 急性创建方式
 *
 * @author lucas
 * @since 2022年11月09日22:06:49
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
