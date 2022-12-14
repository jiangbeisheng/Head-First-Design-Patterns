package headfirst.designpatterns.iterator.transition;

import java.util.Iterator;

/**
 * 将数组转成迭代器
 *
 * @author lucas
 * @since 2022年12月05日16:51:01
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    /**
     * 重写迭代器方法 获取下一个元素
     *
     * @return 菜单项
     */
    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    /**
     * 是否有下一个
     *
     * @return true or false
     */
    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    /**
     * 重写 remove()方法以支持remove操作
     */
    @Override
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
