package headfirst.designpatterns.templatemethod.barista;

/**
 * 咖啡 实现类
 *
 * @author lucas
 * @since 2022年12月04日12:11:30
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter（通过过滤器滴入咖啡）");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
