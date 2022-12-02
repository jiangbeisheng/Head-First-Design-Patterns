package headfirst.designpatterns.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * 迭代器枚举测试
 *
 * @author lucas
 * @since 2022年12月02日19:30:04
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
