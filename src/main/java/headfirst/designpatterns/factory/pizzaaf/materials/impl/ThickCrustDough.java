package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Dough;

/**
 * 厚皮面团
 *
 * @author lucas
 * @since 2022年10月02日12:50:48
 */
public class ThickCrustDough implements Dough {
    /**
     * 制作面团
     *
     * @return 厚饼型特厚面团
     */
    public String toString() {
        return "ThickCrust style extra thick crust dough";
    }
}
