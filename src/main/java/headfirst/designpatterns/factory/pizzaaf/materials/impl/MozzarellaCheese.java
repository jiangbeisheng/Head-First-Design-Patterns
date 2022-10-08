package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Cheese;

/**
 * 马苏里拉奶酪
 *
 * @author lucas
 * @since 2022年10月02日14:00:56
 */
public class MozzarellaCheese implements Cheese {
    /**
     * 制作奶酪
     *
     * @return 切碎的马苏里拉奶酪
     */
    public String toString() {
        return "Shredded Mozzarella";
    }
}
