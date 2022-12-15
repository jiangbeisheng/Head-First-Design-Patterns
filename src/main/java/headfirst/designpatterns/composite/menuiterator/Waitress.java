package headfirst.designpatterns.composite.menuiterator;

import java.util.Iterator;

/**
 * 女服务员
 *
 * @author lucas
 * @since 2022年12月11日22:30:42
 */
public class Waitress {
    /**
     * 菜单组件
     */
    MenuComponent allMenus;

    /**
     * 有参构造
     *
     * @param allMenus 所有菜单
     */
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 打印菜单
     */
    public void printMenu() {
        allMenus.print();
    }

    /**
     * 打印素食菜单
     */
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
