package headfirst.designpatterns.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将枚举类装饰成迭代器类
 *
 * @author lucas
 * @since 2022年12月02日19:11:24
 */
public class EnumerationIterator implements Iterator<Object> {
    /**
     * 枚举
     */
    Enumeration<?> enumeration;

    /**
     * 构造
     *
     * @param enumeration 枚举变量
     */
    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * 是否有下一个
     *
     * @return 是否
     */
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    /**
     * 获取下一个
     *
     * @return 枚举元素
     */
    public Object next() {
        return enumeration.nextElement();
    }

    /**
     * 移除
     */
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
