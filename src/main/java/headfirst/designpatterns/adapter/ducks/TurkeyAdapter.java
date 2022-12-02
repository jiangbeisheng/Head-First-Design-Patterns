package headfirst.designpatterns.adapter.ducks;

/**
 * 火鸡适配器
 * 将火鸡适配为鸭子
 *
 * @author lucas
 * @since 2022年12月02日10:20:10
 */
public class TurkeyAdapter implements Duck {
    /**
     * 火鸡接口
     */
    Turkey turkey;

    /**
     * 构造
     *
     * @param turkey 火鸡
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 鸭子嘎嘎叫
     */
    public void quack() {
        turkey.gobble();
    }

    /**
     * 鸭子飞
     */
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
