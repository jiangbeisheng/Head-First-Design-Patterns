package headfirst.designpatterns.adapter.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Vector转enumeration 简单演示，作用不大
 *
 * @author lucas
 * @since 2022年12月02日19:24:07
 */
public class EI {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>(Arrays.asList(args));
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
