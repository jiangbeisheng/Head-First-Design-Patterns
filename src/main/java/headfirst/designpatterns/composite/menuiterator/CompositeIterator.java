package headfirst.designpatterns.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * 复合迭代器
 *
 * @author lucas
 * @since 2022年12月15日10:51:42
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    /**
     * 构造方法
     *
     * @param iterator 迭代器
     */
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    /**
     * 下一个菜单组件
     *
     * @return 菜单组件
     */
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    /**
     * 是否有下一个
     *
     * @return true 或 false
     */
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
	
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


