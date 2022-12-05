package headfirst.designpatterns.iterator.dinermergercafe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋菜单
 *
 * @author lucas
 * @since 2022年12月05日11:15:27
 */
public class PancakeHouseMenu implements Menu {
    /**
     * 菜单项
     */
    ArrayList<MenuItem> menuItems;

    /**
     * 构造
     */
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    /**
     * 添加菜单
     *
     * @param name        名称
     * @param description 描述
     * @param vegetarian  素食
     * @param price       价格
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * 获取菜单项
     *
     * @return 菜单
     */
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * 创建迭代器
     *
     * @return 迭代器
     */
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    // other menu methods here
}
