package headfirst.designpatterns.adapter.ducks;

/**
 * 野火鸡威士忌
 *
 * @author lucas
 * @since 2022年12月02日10:18:15
 */
public class WildTurkey implements Turkey {
    /**
     * 狼吞虎咽
     */
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    /**
     * 飞
     */
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
