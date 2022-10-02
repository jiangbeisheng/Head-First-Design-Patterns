package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 红辣椒
 *
 * @author lucas
 * @since 2022年10月02日14:41:32
 */
public class RedPepper implements Veggies {
    /**
     * 制作蔬菜
     *
     * @return 红辣椒
     */
    public String toString() {
        return "Red Pepper";
    }
}
