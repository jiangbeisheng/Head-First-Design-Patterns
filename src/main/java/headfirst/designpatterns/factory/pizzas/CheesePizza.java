package headfirst.designpatterns.factory.pizzas;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		super();
		System.out.println("无参构造被访问✅CheesePizza");
		super.name = "Cheese Pizza";
		super.dough = "Regular Crust";
		super.sauce = "Marinara Pizza Sauce";
		super.toppings.add("Fresh Mozzarella");
		super.toppings.add("Parmesan");
	}
}
