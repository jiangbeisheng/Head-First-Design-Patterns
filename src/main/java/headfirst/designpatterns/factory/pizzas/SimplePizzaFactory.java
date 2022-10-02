package headfirst.designpatterns.factory.pizzas;

public class SimplePizzaFactory {

	public SimplePizzaFactory() {
		System.out.println("new 对象就要走构造✅SimplePizzaFactory");
	}
	//工厂就是创建不同type的对象
	public Pizza createPizza(String type) {
		System.out.println("调方法就进方法里面✅createPizza");
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
