package headfirst.designpatterns.command.undo;

/**
 * 吊扇实体
 *
 * @author lucas
 * @since 2022年12月01日20:39:44
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    /**
     * 位置
     */
    String location;
    /**
     * 速度
     */
    int speed;

    /**
     * 构造
     *
     * @param location 位置
     */
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    /**
     * 高
     */
    public void high() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    /**
     * 中
     */
    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    /**
     * 低
     */
    public void low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    /**
     * 关
     */
    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    /**
     * 获取速度
     *
     * @return 速度
     */
    public int getSpeed() {
        return speed;
    }
}
