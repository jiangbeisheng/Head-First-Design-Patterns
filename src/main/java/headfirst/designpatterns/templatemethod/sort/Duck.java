package headfirst.designpatterns.templatemethod.sort;

/**
 * 鸭子 比较
 *
 * @author lucas
 * @since 2022年12月04日14:39:23
 */
public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    /**
     * 构造
     *
     * @param name   名字
     * @param weight 重量
     */
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * 打印 鸭子
     *
     * @return 字符串
     */
    public String toString() {
        return name + " weighs " + weight;
    }

    /**
     * 重写比较
     *
     * @param otherDuck 传入的鸭子对象
     * @return 结果
     */
    public int compareTo(Duck otherDuck) {


        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
}
