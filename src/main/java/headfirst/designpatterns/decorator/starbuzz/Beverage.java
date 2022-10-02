package headfirst.designpatterns.decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";

	public Beverage() {
		super();
	}

	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
