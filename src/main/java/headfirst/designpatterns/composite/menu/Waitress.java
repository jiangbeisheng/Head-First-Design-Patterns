package headfirst.designpatterns.composite.menu;

public class Waitress {
    /**
     * 菜单组件 抽象类
     */
    MenuComponent allMenus;

    /**
     * 构造
     *
     * @param allMenus 所有菜单
     */
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 打印
     */
    public void printMenu() {
        allMenus.print();
    }
}
