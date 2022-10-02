package headfirst.designpatterns.factory.pizzaaf.factory.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.materials.*;
import headfirst.designpatterns.factory.pizzaaf.materials.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    /**
     * 创建面团
     *
     * @return 薄皮面团
     */
    public Dough createDough() {
        return new ThinCrustDough();
    }

    /**
     * 创建酱汁
     *
     * @return 意式蒜香番茄酱
     */
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    /**
     * 创建奶酪
     *
     * @return 雷吉亚诺奶酪
     */
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    /**
     * 创建蔬菜
     *
     * @return 蔬菜
     */
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    /**
     * 制作辣味香肠
     *
     * @return 香肠切片
     */
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    /**
     * 创建蛤蜊
     *
     * @return 新鲜蛤蜊
     */
    public Clams createClam() {
        return new FreshClams();
    }
}
