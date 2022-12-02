package headfirst.designpatterns.adapter.ducks;

/**
 * 绿头鸭
 *
 * @author lucas
 * @since 2022年12月02日10:12:35
 */
public class MallardDuck implements Duck {
    /**
     * 嘎嘎
     */
    public void quack() {
        System.out.println("Quack");
    }

    /**
     * 飞
     */
    public void fly() {
        System.out.println("I'm flying");
    }
}
