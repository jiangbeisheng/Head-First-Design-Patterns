package headfirst.designpatterns.singleton.subclass;

/**
 * 冷却器单体
 *
 * @author lucas
 * @since 2022年11月09日22:11:41
 */
public class CoolerSingleton extends Singleton {
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }

}
