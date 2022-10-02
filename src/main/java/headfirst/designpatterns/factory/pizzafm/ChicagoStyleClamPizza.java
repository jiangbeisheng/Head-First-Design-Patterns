package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		super();
		super.name = "Chicago Style Clam Pizza";
		super.dough = "Extra Thick Crust Dough";
		super.sauce = "Plum Tomato Sauce";

		super.toppings.add("Shredded Mozzarella Cheese");
		super.toppings.add("Frozen Clams from Chesapeake Bay");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
