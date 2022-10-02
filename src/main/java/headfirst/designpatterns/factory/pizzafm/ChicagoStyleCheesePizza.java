package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		super();
		super.name = "Chicago Style Deep Dish Cheese Pizza";
		super.dough = "Extra Thick Crust Dough";
		super.sauce = "Plum Tomato Sauce";

		super.toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
