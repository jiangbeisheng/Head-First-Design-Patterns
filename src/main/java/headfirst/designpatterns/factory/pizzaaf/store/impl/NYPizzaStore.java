package headfirst.designpatterns.factory.pizzaaf.store.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.factory.impl.NYPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.CheesePizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.ClamPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.PepperoniPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.VeggiePizza;
import headfirst.designpatterns.factory.pizzaaf.store.PizzaStore;

/**
 * 纽约披萨商店.
 *
 * @author lucas
 * @since 2022年10月02日15:43:55
 */
public class NYPizzaStore extends PizzaStore {

    /**
     * 根据类型创建不同类型的纽约披萨.
     *
     * @param item 类型
     * @return 披萨
     */
    protected Pizza createPizza(final String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            default:
                System.out.println("unknown pleasures");
        }
        return pizza;
    }
}
