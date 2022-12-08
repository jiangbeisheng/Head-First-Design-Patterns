package headfirst.designpatterns.composite.menu;

/**
 * 菜单组件-抽象类
 * <p>
 * 所以方法都是具体方法，不强制必须重写，但不重写改方法就不支持
 * --巧妙的设计
 *
 * @author lucas
 * @since 2022年12月08日20:00:16
 */
public abstract class MenuComponent {
    /**
     * 添加
     *
     * @param menuComponent 菜单组件
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除
     *
     * @param menuComponent 菜单组件
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * get Child
     *
     * @param i 下标
     * @return 菜单组件
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取名称
     *
     * @return 名称
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取描述
     *
     * @return 描述
     */
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取价格
     *
     * @return 价格
     */
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * 是否为素食主义者
     *
     * @return true or false
     */
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印
     */
    public void print() {
        throw new UnsupportedOperationException();
    }
}
