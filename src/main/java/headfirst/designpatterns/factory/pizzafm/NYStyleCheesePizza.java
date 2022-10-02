package headfirst.designpatterns.factory.pizzafm;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		super();
		super.name = "NY Style Sauce and Cheese Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";

		super.toppings.add("Grated Reggiano Cheese");
	}
}
