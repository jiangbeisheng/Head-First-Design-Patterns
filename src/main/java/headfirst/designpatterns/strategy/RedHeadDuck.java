package headfirst.designpatterns.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		super.flyBehavior = new FlyWithWings();
		super.quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
