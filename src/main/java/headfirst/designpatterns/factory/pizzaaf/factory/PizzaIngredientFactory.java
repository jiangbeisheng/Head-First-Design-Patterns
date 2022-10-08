package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.materials.*;

/**
 * 披萨配料工厂（Ingredient 组分）
 * 工厂提供各种原材料给Pizza，Pizza在商店中制作
 * 所以Pizza类通过构造获取工厂，商店类通过抽象接口来拓展各种Pizza
 *
 * @author lucas
 * @since 2022年10月02日11:02:46
 */
public interface PizzaIngredientFactory {
    /**
     * 创造面团
     *
     * @return 面团
     */
    Dough createDough();

    /**
     * 创建酱汁
     *
     * @return 创建酱汁
     */
    Sauce createSauce();

    /**
     * 创建奶酪
     *
     * @return 奶酪
     */
    Cheese createCheese();

    /**
     * 创建蔬菜
     *
     * @return 蔬菜
     */
    Veggies[] createVeggies();

    /**
     * 制作辣味香肠
     *
     * @return 辣味香肠
     */
    Pepperoni createPepperoni();

    /**
     * 制作蛤
     *
     * @return 蛤
     */
    Clams createClam();

}
