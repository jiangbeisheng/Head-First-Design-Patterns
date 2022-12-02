package headfirst.designpatterns.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * 枚举转迭代器
 *
 * @author lucas
 * @since 2022年12月02日19:31:47
 */
public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
