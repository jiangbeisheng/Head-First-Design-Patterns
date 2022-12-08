package headfirst.designpatterns.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 菜单实现类
 *
 * @author lucas
 * @since 2022年12月08日20:07:03
 */
public class Menu extends MenuComponent {
    /**
     * 菜单组件集合：用于存放所有的菜单
     */
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    /**
     * 构造
     *
     * @param name        名称
     * @param description 描述
     */
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
