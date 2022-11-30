package headfirst.designpatterns.command.party;

/**
 * 电视
 *
 * @author lucas
 * @since 2022年11月30日11:15:33
 */
public class TV {
    /**
     * 位置
     */
    String location;
    /**
     * 频道
     */
    int channel;

    /**
     * 构造
     *
     * @param location 位置
     */
    public TV(String location) {
        this.location = location;
    }

    /**
     * 开
     */
    public void on() {
        System.out.println(location + " TV is on");
    }

    /**
     * 关
     */
    public void off() {
        System.out.println(location + " TV is off");
    }

    /**
     * 设置输入频道
     */
    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }
}
