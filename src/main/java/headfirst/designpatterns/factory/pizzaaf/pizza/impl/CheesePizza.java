package headfirst.designpatterns.factory.pizzaaf.pizza.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;

/**
 * 芝士披萨
 */
public class CheesePizza extends Pizza {
    /**
     * 披萨配料工厂（Ingredient 组分）
     */
    PizzaIngredientFactory ingredientFactory;

    /**
     * 芝士披萨类带参构造。
     * 要制作披萨需要工厂提供原料，所以每个披萨类都需要从构造器参数中得到一个工厂，
     * 并把这个工厂存储在一个实例变量中。
     *
     * @param ingredientFactory 配料厂
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 一步一步创建芝士披萨，每当需要原料时，就跟工厂要
     */
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
