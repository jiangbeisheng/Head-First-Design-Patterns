package headfirst.designpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		super();
		super.description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

