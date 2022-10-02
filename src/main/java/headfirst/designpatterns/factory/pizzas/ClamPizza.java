package headfirst.designpatterns.factory.pizzas;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		super();
		super.name = "Clam Pizza";
		super.dough = "Thin crust";
		super.sauce = "White garlic sauce";
		super.toppings.add("Clams");
		super.toppings.add("Grated parmesan cheese");
	}
}
