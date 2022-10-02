package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Cheese;

/**
 * 帕玛森芝士
 */
public class ParmesanCheese implements Cheese {

    /**
     * 制作芝士
     *
     * @return 切碎的帕玛森芝士
     */
    public String toString() {
        return "Shredded Parmesan（切碎的帕玛森芝士）";
    }
}
