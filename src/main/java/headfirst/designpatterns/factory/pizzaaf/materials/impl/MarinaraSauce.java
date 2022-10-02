package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Sauce;

/**
 * 意式蒜香番茄酱
 *
 * @author lucas
 * @since 2022年10月02日12:51:59
 */
public class MarinaraSauce implements Sauce {
    /**
     * 制作酱料
     *
     * @return 马里纳拉酱
     */
    public String toString() {
        return "Marinara Sauce";
    }
}
