package headfirst.designpatterns.command.undo;

/**
 * 灯的关闭命令
 *
 * @author lucas
 * @since 2022年12月01日20:29:06
 */
public class LightOffCommand implements Command {
    /**
     * 灯 实体
     */
    Light light;
    /**
     * 级别 从灯中来
     */
    int level;

    /**
     * 构造方法
     *
     * @param light 灯
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * 执行
     */
    public void execute() {
        level = light.getLevel();
        light.off();
    }

    /**
     * 撤销
     */
    public void undo() {
        light.dim(level);
    }
}
