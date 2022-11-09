package headfirst.designpatterns.singleton.dcl;

/**
 * DCL单例测试
 *
 * @author lucas
 * @since 2022年11月09日22:06:07
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
