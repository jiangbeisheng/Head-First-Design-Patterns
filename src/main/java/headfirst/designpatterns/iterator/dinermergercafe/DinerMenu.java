package headfirst.designpatterns.iterator.dinermergercafe;

import java.util.Iterator;

/**
 * 食客菜单-数组
 *
 * @author lucas
 * @since 2022年12月05日11:19:55
 */
public class DinerMenu implements Menu {
    /**
     * 最大项目数
     */
    static final int MAX_ITEMS = 6;
    /**
     * 第几项
     */
    int numberOfItems = 0;
    /**
     * 菜单项
     */
    MenuItem[] menuItems;

    /**
     * 构造
     */
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "A medly of steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    /**
     * 添加项目
     *
     * @param name        名字
     * @param description 描述
     * @param vegetarian  素食
     * @param price       价格
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    /**
     * 获取菜单
     *
     * @return 整个菜单
     */
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    /**
     * 创建迭代器
     *
     * @return 迭代器
     */
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
        //return new AlternatingDinerMenuIterator(menuItems);
    }

    // other menu methods here
}
