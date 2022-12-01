package headfirst.designpatterns.command.undo;

/**
 * 开灯命令类
 *
 * @author lucas
 * @since 2022年12月01日20:25:19
 */
public class LightOnCommand implements Command {
    /**
     * 灯
     */
    Light light;
    /**
     * 级别
     */
    int level;

    /**
     * 构造
     *
     * @param light 灯
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 执行 各种命令实现负责实现命令接口
     */
    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    /**
     * 撤销 执行各个命令
     */
    @Override
    public void undo() {
        light.dim(level);
    }
}
