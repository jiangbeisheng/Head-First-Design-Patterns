package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 菠菜
 *
 * @author lucas
 * @since 2022年10月02日14:43:36
 */
public class Spinach implements Veggies {
    /**
     * 制作蔬菜
     *
     * @return 菠菜
     */
    public String toString() {
        return "Spinach";
    }
}
