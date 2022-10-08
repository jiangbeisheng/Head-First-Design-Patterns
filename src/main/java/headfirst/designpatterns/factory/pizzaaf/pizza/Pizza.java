package headfirst.designpatterns.factory.pizzaaf.pizza;

import headfirst.designpatterns.factory.pizzaaf.materials.*;

/**
 * 抽象披萨类
 *
 * @author lucas
 * @since 2022年10月02日11:16:43
 */
public abstract class Pizza {
    /**
     * 名称
     */
    protected String name;
    /**
     * 面团
     */
    protected Dough dough;
    /**
     * 酱料
     */
    protected Sauce sauce;
    /**
     * 蔬菜
     */
    protected Veggies[] veggies;
    /**
     * 芝士
     */
    protected Cheese cheese;
    /**
     * 意大利辣香肠
     */
    protected Pepperoni pepperoni;
    /**
     * 蛤蜊
     */
    protected Clams clam;

    /**
     * 在这个方法中，我们需要收集披萨所需的原料，而这些原料当然是来着原料工厂了
     * 将工艺和工厂解耦，从而实现了工艺和原料工厂解耦，以便将来方便换工厂
     */
    public abstract void prepare();

    /**
     * 在350℃烘焙25分钟
     */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * 把比萨饼切成对角片
     */
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * 将比萨饼放在正式的比萨饼店盒子里
     */
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取名称
     *
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 重写toString
     *
     * @return 字符串
     */
    public String toString() {
        /*
         StringBuffer 是线程安全的，而StringBuilder 则没有实现线程安全功能，所以性能略高。
         因此在通常情况下，如果需要创建一个内容可变的字符串对象，则应该优先考虑使用StringBuilder 类。
         */
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
