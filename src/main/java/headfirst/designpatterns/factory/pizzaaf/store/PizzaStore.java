package headfirst.designpatterns.factory.pizzaaf.store;

import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;

/**
 * 披萨商店抽象接口
 *
 * @author lucas
 * @since 2022年10月02日15:41:45
 */
public abstract class PizzaStore {
    /**
     * 创建披萨抽象发方法
     *
     * @param item 类型
     * @return 披萨
     */
    protected abstract Pizza createPizza(String item);

    /**
     * 订购披萨
     *
     * @param type 类型
     * @return 披萨
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
