package headfirst.designpatterns.iterator.transition;

import java.util.ArrayList;

/**
 * 迭代器模式测试类
 *
 * @author lucas
 * @since 2022年12月05日16:48:05
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();

    }
}
