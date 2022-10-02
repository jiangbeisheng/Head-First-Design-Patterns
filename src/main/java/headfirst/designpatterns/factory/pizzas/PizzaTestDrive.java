package headfirst.designpatterns.factory.pizzas;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		//简单工厂负责根据不同的type在PizzaStore内部的orderPizza()中创建不同的pizza对象
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		//延迟到创建订单的时候才创建type类型的pizza
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
