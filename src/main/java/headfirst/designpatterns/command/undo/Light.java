package headfirst.designpatterns.command.undo;

/**
 * 灯 实体灯
 *
 * @author lucas
 * @since 2022年12月01日20:22:03
 */
public class Light {
    /**
     * 位置
     */
    String location;
    /**
     * 等级
     */
    int level;

    /**
     * 构造
     *
     * @param location 位置，屋里的位置
     */
    public Light(String location) {
        this.location = location;
    }

    /**
     * 打开
     */
    public void on() {
        level = 100;
        System.out.println("Light is on");
    }

    /**
     * 关闭
     */
    public void off() {
        level = 0;
        System.out.println("Light is off");
    }

    /**
     * 昏暗的
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
     * 获取等级
     *
     * @return 等级
     */
    public int getLevel() {
        return level;
    }
}
