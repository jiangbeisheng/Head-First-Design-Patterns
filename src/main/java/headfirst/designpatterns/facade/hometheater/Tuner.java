package headfirst.designpatterns.facade.hometheater;

/**
 * 调谐器
 *
 * @author lucas
 * @since 2022年12月03日11:54:17
 */
public class Tuner {
    /**
     * 描述
     */
    String description;
    /**
     * 调谐器
     */
    Amplifier amplifier;
    /**
     * 频率
     */
    double frequency;

    /**
     * 构造
     *
     * @param description 描述
     * @param amplifier   功放
     */
    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println(description + " on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println(description + " off");
    }

    /**
     * 设置频率
     *
     * @param frequency 频率
     */
    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    /**
     * 设置AM
     */
    public void setAm() {
        System.out.println(description + " setting AM mode");
    }

    /**
     * 设置FM
     */
    public void setFm() {
        System.out.println(description + " setting FM mode");
    }

    /**
     * 返回描述
     *
     * @return 描述
     */
    public String toString() {
        return description;
    }
}
