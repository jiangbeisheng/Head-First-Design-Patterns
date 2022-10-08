package headfirst.designpatterns.factory.pizzaaf.store.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.factory.impl.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.CheesePizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.ClamPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.PepperoniPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.impl.VeggiePizza;
import headfirst.designpatterns.factory.pizzaaf.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

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
