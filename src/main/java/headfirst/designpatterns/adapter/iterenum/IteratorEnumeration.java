package headfirst.designpatterns.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 迭代器枚举
 *
 * @author lucas
 * @since 2022年12月02日19:26:59
 */
public class IteratorEnumeration implements Enumeration<Object> {
    /**
     * 迭代器转枚举
     */
    Iterator<?> iterator;

    /**
     * 构造
     *
     * @param iterator 迭代器
     */
    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    /**
     * 是否存在更多元素
     *
     * @return 是否
     */
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    /**
     * 下一个元素
     *
     * @return 元素
     */
    public Object nextElement() {
        return iterator.next();
    }
}
