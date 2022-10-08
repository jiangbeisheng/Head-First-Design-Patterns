package headfirst.designpatterns.factory.pizzaaf.store.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.factory.impl.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.CheesePizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.ClamPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.PepperoniPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.VeggiePizza;
import headfirst.designpatterns.factory.pizzaaf.store.PizzaStore;

/**
 * 芝加哥披萨商店
 *
 * @author lucas
 * @since 2022年10月08日21:46:09
 */
public class ChicagoPizzaStore extends PizzaStore {
    /**
     * 重写创建披萨的方法，这里使用芝加哥披萨工厂提供原料，
     * 通过方法type实现不同原料、工艺下的披萨
     *
     * @param item 类型
     * @return 各种类型的芝加哥披萨
     */
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            default:
                System.out.println("unknown pleasures");
        }
        return pizza;
    }
}
