package headfirst.designpatterns.command.simpleremote;

/**
 * 灯，实体对象
 *
 * @author lucas
 * @since 2022年11月13日13:36:51
 */
public class Light {
    /**
     * 无参构造
     */
    public Light() {
    }

    /**
     * 开灯
     */
    public void on() {
        System.out.println("Light is on");
    }

    /**
     * 关灯
     */
    public void off() {
        System.out.println("Light is off");
    }
}
