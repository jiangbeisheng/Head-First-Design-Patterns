package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		super();
		super.name = "Chicago Deep Dish Veggie Pizza";
		super.dough = "Extra Thick Crust Dough";
		super.sauce = "Plum Tomato Sauce";

		super.toppings.add("Shredded Mozzarella Cheese");
		super.toppings.add("Black Olives");
		super.toppings.add("Spinach");
		super.toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
