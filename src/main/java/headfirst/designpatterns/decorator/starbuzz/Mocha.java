package headfirst.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super();
		super.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
