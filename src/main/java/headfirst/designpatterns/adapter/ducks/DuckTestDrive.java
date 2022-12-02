package headfirst.designpatterns.adapter.ducks;

import headfirst.designpatterns.adapter.ducks.challenge.Drone;
import headfirst.designpatterns.adapter.ducks.challenge.DroneAdapter;
import headfirst.designpatterns.adapter.ducks.challenge.SuperDrone;

/**
 * 鸭子适配器的测试类
 *
 * @author lucas
 * @since 2022年12月02日10:27:08
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        // Challenge
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    /**
     * 测试鸭子
     * 火鸡通过适配器转成了鸭子就可以用这个方法了
     *
     * @param duck 鸭子
     */
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
