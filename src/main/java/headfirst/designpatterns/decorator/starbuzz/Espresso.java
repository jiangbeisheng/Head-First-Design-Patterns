package headfirst.designpatterns.decorator.starbuzz;

public class Espresso extends Beverage {
  
	public Espresso() {
		super();
		super.description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

