package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 黑橄榄
 *
 * @author lucas
 * @since 2022年10月02日14:04:25
 */
public class BlackOlives implements Veggies {

    /**
     * 制作蔬菜
     *
     * @return 黑橄榄
     */
    public String toString() {
        return "Black Olives";
    }
}
