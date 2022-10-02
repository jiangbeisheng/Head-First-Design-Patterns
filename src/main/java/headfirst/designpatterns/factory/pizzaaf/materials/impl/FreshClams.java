package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Clams;

/**
 * 新鲜蛤蜊
 *
 * @author lucas
 * @since 2022年10月02日13:09:27
 */
public class FreshClams implements Clams {
    /**
     * 制作蛤蜊
     *
     * @return 长岛湾新鲜蛤蜊
     */
    public String toString() {
        return "Fresh Clams from Long Island Sound";
    }
}
