package headfirst.designpatterns.templatemethod.simplebarista;

/**
 * 咖啡师
 *
 * @author lucas
 * @since 2022年12月03日21:39:29
 */
public class Barista {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
