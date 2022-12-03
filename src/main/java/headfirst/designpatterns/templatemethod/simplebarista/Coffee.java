package headfirst.designpatterns.templatemethod.simplebarista;

/**
 * 咖啡
 *
 * @author lucas
 * @since 2022年12月03日21:42:16
 */
public class Coffee {
    /**
     * 准备食谱
     */
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /**
     * 煮沸的水
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 冲泡咖啡研磨
     */
    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    /**
     * 倒入杯
     */
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 添加糖和牛奶
     */
    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
