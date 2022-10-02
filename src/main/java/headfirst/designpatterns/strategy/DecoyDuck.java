package headfirst.designpatterns.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		super.setFlyBehavior(new FlyNoWay());
		super.setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
