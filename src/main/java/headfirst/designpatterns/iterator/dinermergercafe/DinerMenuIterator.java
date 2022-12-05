package headfirst.designpatterns.iterator.dinermergercafe;

import java.util.Iterator;

/**
 * 数组对象转迭代器对象
 *
 * @author lucas
 * @since 2022年12月05日14:04:42
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    /**
     * 真数组 假list
     */
    MenuItem[] list;
    /**
     * 下标初始值
     */
    int position = 0;

    /**
     * 餐厅菜单迭代器
     *
     * @param list 数组
     */
    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    /**
     * 重写一下个方法
     *
     * @return 菜单对象
     */
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    /**
     * 有下一个吗？
     *
     * @return true or false
     */
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    /**
     * 移除一个
     */
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }

}
