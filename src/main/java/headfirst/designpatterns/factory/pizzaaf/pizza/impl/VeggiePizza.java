package headfirst.designpatterns.factory.pizzaaf.pizza.impl;

import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    /**
     * 将工艺和工厂解耦，从而实现了工艺和原料工厂解耦，以便将来方便换工厂
     *
     * @param ingredientFactory 原料工厂
     */
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
