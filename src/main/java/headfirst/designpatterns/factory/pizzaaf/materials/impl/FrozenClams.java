package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Clams;

/**
 * 速冻蛤蜊
 *
 * @author lucas
 * @since 2022年10月02日14:06:13
 */
public class FrozenClams implements Clams {
    /**
     * 制作蛤蜊
     *
     * @return 切萨皮克湾的冷冻文蛤
     */
    public String toString() {
        return "Frozen Clams from Chesapeake Bay";
    }
}
