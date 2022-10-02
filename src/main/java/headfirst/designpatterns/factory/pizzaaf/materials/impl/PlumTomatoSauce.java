package headfirst.designpatterns.factory.pizzaaf.materials.impl;

import headfirst.designpatterns.factory.pizzaaf.materials.Sauce;

/**
 * 李子番茄酱
 *
 * @author lucas
 * @since 2022年10月02日13:58:25
 */
public class PlumTomatoSauce implements Sauce {
    /**
     * 制作酱料
     *
     * @return 番茄酱配李子西红柿
     */
    public String toString() {
        return "Tomato sauce with plum tomatoes";
    }
}
