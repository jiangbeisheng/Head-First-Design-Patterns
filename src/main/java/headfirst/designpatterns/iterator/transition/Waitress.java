package headfirst.designpatterns.iterator.transition;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 女服务员 - 客户端
 *
 * @author lucas
 * @since 2022年12月05日18:58:43
 */
public class Waitress {
    /**
     * 菜单集合
     * 汇聚不同餐厅的菜单，好在他们都实现了Menu接口
     */
    ArrayList<Menu> menus;

    /**
     * 构造
     *
     * @param menus 菜单集合
     */
    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    /**
     * 打印菜单
     * 打印的是构造传进来的菜单
     */
    public void printMenu() {
        Iterator<?> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    /**
     * 打印菜单
     * 打印的是改方法接收的迭代器实现类
     *
     * @param iterator 迭代器
     */
    void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}  
