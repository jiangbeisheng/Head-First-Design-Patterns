package headfirst.designpatterns.iterator.dinermergercafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 咖啡菜单-HashMap
 *
 * @author lucas
 * @since 2022年12月05日13:45:32
 */
public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<>();

    /**
     * 空构造 创建对象就添加
     */
    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    /**
     * 获取菜单
     *
     * @return 菜单map对象
     */
    public Map<String, MenuItem> getItems() {
        return menuItems;
    }

    /**
     * 创建迭代器
     *
     * @return 迭代器对象
     */
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
