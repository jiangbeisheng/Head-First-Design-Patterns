package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 蘑菇
 *
 * @author lucas
 * @since 2022年10月02日14:32:25
 */
public class Mushroom implements Veggies {
    /**
     * 制作蘑菇
     *
     * @return 蘑菇
     */
    public String toString() {
        return "Mushrooms";
    }
}
