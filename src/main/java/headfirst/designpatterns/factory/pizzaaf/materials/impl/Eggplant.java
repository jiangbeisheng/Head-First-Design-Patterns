package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 茄子
 *
 * @author lucas
 * @since 2022年10月02日14:39:04
 */
public class Eggplant implements Veggies {
    /**
     * 制作蔬菜
     *
     * @return 茄子
     */
    public String toString() {
        return "Eggplant";
    }
}
