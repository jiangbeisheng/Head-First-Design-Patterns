package headfirst.designpatterns.command.party;

/**
 * 热水浴缸
 *
 * @author lucas
 * @since 2022年11月30日11:24:05
 */
public class Hottub {
    /**
     * 开
     */
    boolean on;
    /**
     * 温度
     */
    int temperature;

    /**
     * 构造
     */
    public Hottub() {
    }

    /**
     * 开
     */
    public void on() {
        on = true;
    }

    /**
     * 关
     */
    public void off() {
        on = false;
    }

    /**
     * 循环
     */
    public void circulate() {
        if (on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    /**
     * 喷气式飞机打开
     */
    public void jetsOn() {
        if (on) {
            System.out.println("Hottub jets are on");
        }
    }

    /**
     * 喷气式飞机关闭
     */
    public void jetsOff() {
        if (on) {
            System.out.println("Hottub jets are off");
        }
    }

    /**
     * 设定温度
     *
     * @param temperature 设定温度
     */
    public void setTemperature(int temperature) {
        if (temperature > this.temperature) {
            System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
        } else {
            System.out.println("Hottub is cooling to " + temperature + " degrees");
        }
        this.temperature = temperature;
    }
}
