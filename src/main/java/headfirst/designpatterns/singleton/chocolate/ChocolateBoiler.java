package headfirst.designpatterns.singleton.chocolate;

/**
 * 巧克力锅炉
 *
 * @author lucas
 * @since 2022年11月08日20:42:51
 */
public class ChocolateBoiler {
    /**
     * 单例模式经典声明静态类名牌变量
     */
    private static ChocolateBoiler uniqueInstance;
    /**
     * 空
     */
    private boolean empty;
    /**
     * 沸腾
     */
    private boolean boiled;

    /**
     * 私有无参构造
     */
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * 单例模式获取对象的典型静态构造方法
     * 经典是因为都叫getInstance
     *
     * @return 巧克力锅炉
     */
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    /**
     * 填满
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    /**
     * 滤干煮过的牛奶和巧克力
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    /**
     * 把里面的东西煮开
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    /**
     * 是否为空
     *
     * @return 布尔值
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * 是否沸腾
     *
     * @return 是否
     */
    public boolean isBoiled() {
        return boiled;
    }
}
