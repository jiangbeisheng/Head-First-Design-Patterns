package headfirst.designpatterns.templatemethod.barista;

/**
 * 茶 实现类
 *
 * @author lucas
 * @since 2022年12月04日12:10:45
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea（泡茶）");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
