package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Dough;

/**
 * 薄皮面团
 *
 * @author lucas
 * @since 2022年10月02日12:42:46
 */
public class ThinCrustDough implements Dough {
    /**
     * 制作面团
     *
     * @return 薄皮面团
     */
    public String toString() {
        return "Thin Crust Dough";
    }
}
