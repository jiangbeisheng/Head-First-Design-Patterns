package headfirst.designpatterns.command.party;

/**
 * 灯类
 *
 * @author lucas
 * @since 2022年11月30日11:08:33
 */
public class Light {
    /**
     * 位置
     */
    String location;
    /**
     * 级别
     */
    int level;

    /**
     * 构造方法
     *
     * @param location 位置
     */
    public Light(String location) {
        this.location = location;
    }

    /**
     * 开
     */
    public void on() {
        level = 100;
        System.out.println("Light is on");
    }

    /**
     * 关
     */
    public void off() {
        level = 0;
        System.out.println("Light is off");
    }

    /**
     * 昏暗
     *
     * @param level 级别
     */
    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    /**
     * 获取级别
     *
     * @return 级别
     */
    public int getLevel() {
        return level;
    }
}
