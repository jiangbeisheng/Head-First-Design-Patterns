package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		super();
		super.name = "Chicago Style Pepperoni Pizza";
		super.dough = "Extra Thick Crust Dough";
		super.sauce = "Plum Tomato Sauce";

		super.toppings.add("Shredded Mozzarella Cheese");
		super.toppings.add("Black Olives");
		super.toppings.add("Spinach");
		super.toppings.add("Eggplant");
		super.toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
