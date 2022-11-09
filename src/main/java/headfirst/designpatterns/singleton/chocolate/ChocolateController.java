package headfirst.designpatterns.singleton.chocolate;

/**
 * 巧克力控制器
 *
 * @author lucas
 * @since 2022年11月08日20:48:31
 */
public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
