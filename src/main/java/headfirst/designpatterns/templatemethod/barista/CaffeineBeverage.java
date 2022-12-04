package headfirst.designpatterns.templatemethod.barista;

/**
 * 模板抽象类
 * 咖啡因饮料（茶，咖啡等）
 *
 * @author lucas
 * @since 2022年12月04日12:01:30
 */
public abstract class CaffeineBeverage {
    /**
     * 准备食谱
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 抽象 冲泡饮料
     */
    abstract void brew();

    /**
     * 抽象 添加调味品
     */
    abstract void addCondiments();

    /**
     * 烧开水
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 倒入杯
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
