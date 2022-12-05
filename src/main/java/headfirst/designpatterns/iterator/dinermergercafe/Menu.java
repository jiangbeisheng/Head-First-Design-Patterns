package headfirst.designpatterns.iterator.dinermergercafe;

import java.util.Iterator;

/**
 * 菜单接口
 * 所有的菜单都要实现它
 *
 * @author lucas
 * @since 2022年12月05日14:23:40
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
