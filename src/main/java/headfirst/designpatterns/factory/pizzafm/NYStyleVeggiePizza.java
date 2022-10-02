package headfirst.designpatterns.factory.pizzafm;

public class NYStyleVeggiePizza extends Pizza {


	public NYStyleVeggiePizza() {
		super();
		super.name = "NY Style Veggie Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";

		super.toppings.add("Grated Reggiano Cheese");
		super.toppings.add("Garlic");
		super.toppings.add("Onion");
		super.toppings.add("Mushrooms");
		super.toppings.add("Red Pepper");
	}
}
