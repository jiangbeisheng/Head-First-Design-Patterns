package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Veggies;

/**
 * 大蒜
 */
public class Garlic implements Veggies {
    /**
     * 制作蔬菜
     *
     * @return 大蒜
     */
    public String toString() {
        return "Garlic";
    }
}
