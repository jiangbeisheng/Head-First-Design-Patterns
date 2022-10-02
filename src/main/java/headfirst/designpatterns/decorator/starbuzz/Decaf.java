package headfirst.designpatterns.decorator.starbuzz;

public class Decaf extends Beverage {
	public Decaf() {
		super();
		super.description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

