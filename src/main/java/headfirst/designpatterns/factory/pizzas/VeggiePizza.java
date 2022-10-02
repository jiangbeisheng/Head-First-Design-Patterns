package headfirst.designpatterns.factory.pizzas;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		super();
		super.name = "Veggie Pizza";
		super.dough = "Crust";
		super.sauce = "Marinara sauce";
		super.toppings.add("Shredded mozzarella");
		super.toppings.add("Grated parmesan");
		super.toppings.add("Diced onion");
		super.toppings.add("Sliced mushrooms");
		super.toppings.add("Sliced red pepper");
		super.toppings.add("Sliced black olives");
	}
}
