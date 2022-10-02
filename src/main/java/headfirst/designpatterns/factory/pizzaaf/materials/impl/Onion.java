package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 洋葱
 *
 * @author lucas
 * @since 2022年10月02日14:34:20
 */
public class Onion implements Veggies {
    /**
     * 制作蔬菜
     *
     * @return 洋葱
     */
    public String toString() {
        return "Onion";
    }
}
