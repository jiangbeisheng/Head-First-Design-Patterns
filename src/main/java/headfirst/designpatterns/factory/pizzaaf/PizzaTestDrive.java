package headfirst.designpatterns.factory.pizzaaf;

import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;
import headfirst.designpatterns.factory.pizzaaf.store.PizzaStore;
import headfirst.designpatterns.factory.pizzaaf.store.impl.ChicagoPizzaStore;
import headfirst.designpatterns.factory.pizzaaf.store.impl.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        //重点在于子类实现了父类的抽象方法，父类像一个模板一样把不确定的方法抽象出去，并得到不同的子类对象调用其中的方法，得到不同的效果
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        //orderPizza方法只在父类中有，父类通过这个方法去调用自己的抽象方法，将来谁去实现，就调用谁实现了的方法
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.toString() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.toString() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.toString() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.toString() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");
    }
}
