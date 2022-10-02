package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Cheese;

/**
 * 雷吉亚诺芝士
 *
 * @author lucas
 * @since 2022年10月02日13:03:02
 */
public class ReggianoCheese implements Cheese {
    /**
     * 做芝士的方法
     *
     * @return 雷吉亚诺芝士
     */
    public String toString() {
        return "Reggiano Cheese";
    }
}
