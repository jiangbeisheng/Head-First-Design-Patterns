package headfirst.designpatterns.adapter.ducks;

import java.util.Random;

/**
 * 鸭子适配器 将鸭子适配成火鸡
 *
 * @author lucas
 * @since 2022年12月02日13:43:40
 */
public class DuckAdapter implements Turkey {
    /**
     * 鸭子
     */
    Duck duck;
    /**
     * 随机
     */
    Random rand;

    /**
     * 构造
     *
     * @param duck 鸭子
     */
    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    /**
     * 火鸡的gobble方法
     */
    public void gobble() {
        duck.quack();
    }

    /**
     * 火鸡的fly方法
     */
    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
