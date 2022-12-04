package headfirst.designpatterns.templatemethod.barista;

/**
 * 带钩子的咖啡因饮料
 *
 * @author lucas
 * @since 2022年12月04日13:10:01
 */
public abstract class CaffeineBeverageWithHook {
    /**
     * 模板方法
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * 抽象冲泡
     */
    abstract void brew();

    /**
     * 抽象添加配料
     */
    abstract void addCondiments();

    /**
     * 烧水
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 到水
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子方法 让子类去判断，默认给true
     *
     * @return 是 或 否
     */
    boolean customerWantsCondiments() {
        return true;
    }
}