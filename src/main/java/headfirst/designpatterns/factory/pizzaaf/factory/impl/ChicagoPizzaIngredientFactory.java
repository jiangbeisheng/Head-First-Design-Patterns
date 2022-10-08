package headfirst.designpatterns.factory.pizzaaf.factory.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.materials.*;
import headfirst.designpatterns.factory.pizzaaf.materials.impl.*;

/**
 * 芝加哥披萨配料厂
 *
 * @author lucas
 * @since 2022年10月02日13:12:34
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    /**
     * 创建面团
     *
     * @return 厚皮面团
     */
    public Dough createDough() {
        return new ThickCrustDough();
    }

    /**
     * 创建酱汁
     *
     * @return 李子番茄酱
     */
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    /**
     * 创建奶酪
     *
     * @return 马苏里拉奶酪
     */
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    /**
     * 制作蔬菜
     *
     * @return 蔬菜
     */
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(),
                new Spinach(),
                new Eggplant()};
    }

    /**
     * 制作辣味香肠
     *
     * @return 切片辣香肠
     */
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    /**
     * 制作辣味蛤蜊
     *
     * @return 速冻蛤蜊
     */
    public Clams createClam() {
        return new FrozenClams();
    }
}
