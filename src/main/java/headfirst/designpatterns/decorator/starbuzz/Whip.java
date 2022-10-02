package headfirst.designpatterns.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super();
		super.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
