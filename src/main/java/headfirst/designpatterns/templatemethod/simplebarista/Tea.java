package headfirst.designpatterns.templatemethod.simplebarista;

/**
 * 茶 - 制作茶的步骤
 *
 * @author lucas
 * @since 2022年12月03日21:41:25
 */
public class Tea {
    /**
     * 准备食谱
     */
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    /**
     * 煮沸的水
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 泡茶袋
     */
    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    /**
     * 添加柠檬
     */
    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    /**
     * 倒入杯
     */
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
