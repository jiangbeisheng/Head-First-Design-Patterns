package headfirst.designpatterns.factory.pizzas;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		super();
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}
}
