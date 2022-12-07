package headfirst.designpatterns.iterator.dinermerger;

import java.util.Calendar;

/**
 * 交替食客菜单迭代器
 *
 * @author lucas
 * @since 2022年12月07日22:20:22
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
